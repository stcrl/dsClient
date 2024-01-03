package com.devsuperior.dsclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	
	@GetMapping
 public ResponseEntity<List<Client>> findAll(){
	 List<Client> list = new ArrayList<>();
	list.add(new Client(1L,"jose","804.666.430-00",4.000,1));
	list.add(new Client(2L,"joão","802.698.423-00",9.000,4));
	return ResponseEntity.ok(list);
	 
 }
}
