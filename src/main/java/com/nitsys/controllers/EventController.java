package com.nitsys.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nitsys.dto.Event;
import com.nitsys.dto.Product;
import com.nitsys.service.InventoryService;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

/*
 * http://localhost:5001/events
 * 
 * [ { "id":1, "event":"music", "artist":"Arj" } ]
 */

@RestController
@RequestMapping("/v1")
@Slf4j
public class EventController {
	
	@Autowired
	InventoryService inventoryService;
	

	@GetMapping("/event")
	public List<Event> getEvents() {
		return Arrays.asList(new Event(1, "Music", "Arijit"), new Event(2, "Dance", "Govinda"));
	}

	@GetMapping("/event/{id}")
	public Event getEventbyId(@PathVariable int id) {
		
		return getEvents().get(id);
	}

	@GetMapping("/eventid")
	public Event getEventbyIdReqParam(@RequestParam int id) {

		return getEvents().get(id);
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Hi Welcome";
	}
	
	
	
	  @GetMapping("/product") 
	  public List<Product> getAllProduct() {
	               return inventoryService.getAllProduct();
	  }
	 
	 

}
