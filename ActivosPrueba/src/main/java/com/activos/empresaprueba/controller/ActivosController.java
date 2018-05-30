package com.activos.empresaprueba.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.activos.empresaprueba.model.Activos;
import com.activos.empresaprueba.service.ActivosService;
import com.activos.empresaprueba.service.AreaService;
import com.activos.empresaprueba.util.CustomErrorType;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class ActivosController {
	
	@Autowired
	ActivosService _activosService;
	
	//POST
		@RequestMapping(value="/activosFijos", method = RequestMethod.POST, headers = "Accept=application/json")
		public ResponseEntity<?> createActivosFijos(@RequestBody Activos activos, UriComponentsBuilder uriComponentsBuilder){
			if (activos.getNombreactivo().equals(null) || activos.getNombreactivo().isEmpty()) {
				return new ResponseEntity(new CustomErrorType("ActivoFijo el nombre es requerido"), HttpStatus.CONFLICT);
			}
			
			if (_activosService.findByName(activos.getNombreactivo()) != null) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
			
			_activosService.saveActivos(activos);
			Activos activosFijos2 = _activosService.findByName(activos.getNombreactivo());
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(
					uriComponentsBuilder.path("/v1/activosFijos/{id}")
					.buildAndExpand(activosFijos2.getIdActivos())
					.toUri()
					);
			
			return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		}
		//GET
		@RequestMapping(value="/activosFijos", method = RequestMethod.GET, headers = "Accept=application/json")
		public ResponseEntity<List<Activos>> getSocialMedias(@RequestParam(value="serial", required=false) String serial){
			
			List<Activos> activos = new ArrayList<>();
			
			if (serial == null) {
				activos = _activosService.findAllActivos();
				if (activos.isEmpty()) {
					return new ResponseEntity(HttpStatus.NO_CONTENT);
				}
				
				return new ResponseEntity<List<Activos>>(activos, HttpStatus.OK);
			} else {
				Activos activosBySerie = _activosService.findBySerial(serial);
				if (activosBySerie == null) {
					return new ResponseEntity(HttpStatus.NOT_FOUND);
				}
				
				activos.add(activosBySerie);
				return new ResponseEntity<List<Activos>>(activos, HttpStatus.OK);
			}
		}
		
	
		//GET
		@RequestMapping(value="/activosFijos/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
		public ResponseEntity<Activos> getActivosById(@PathVariable("id") Long idActivos){
			if (idActivos == null || idActivos <= 0) {
				return new ResponseEntity(new CustomErrorType("idActivos es requerido"), HttpStatus.CONFLICT);
			}
			
			Activos activos = _activosService.findById(idActivos);
			if (idActivos == null) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<Activos>(activos, HttpStatus.OK);
		}
		//UPDATE
		@RequestMapping(value="/activosFijos/{id}", method = RequestMethod.PATCH, headers = "Accept=application/json")
		public ResponseEntity<Activos> updateActivos(@PathVariable("id") Long idActivos, @RequestBody Activos activos){
			if (idActivos == null || idActivos <= 0) {
				return new ResponseEntity(new CustomErrorType("idActivos is requerido"), HttpStatus.CONFLICT);
			}
			
			Activos currentActivos = _activosService.findById(idActivos);
			if (currentActivos == null) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
			
			currentActivos.setFecha_baja(activos.getFecha_baja());
			currentActivos.setSerial(activos.getSerial());
			
			_activosService.updateActivos(currentActivos);
			return new ResponseEntity<Activos>(currentActivos, HttpStatus.OK);
		}
}
