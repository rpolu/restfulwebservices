package com.elegant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elegant.model.OrangeBusModel;
import com.elegant.service.OrangeBusService;

@RestController
public class OrangeBuContoller {
	@Autowired
	private OrangeBusService orangeBusService;

	@GetMapping("/getAll")
	public List<OrangeBusModel> getBusses() {
		return orangeBusService.getAllBus();
	}

	@PostMapping("/saveBus")
	public ResponseEntity<Void> saveOrangeBus(@RequestBody OrangeBusModel orangeBusModel) {
		orangeBusService.saveBus(orangeBusModel);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/getBus/{sn}", method = RequestMethod.GET)
	public OrangeBusModel getBus(@PathVariable("sn") String serviceNum) {
		return orangeBusService.getBus(Integer.parseInt(serviceNum));
	}

	@DeleteMapping("/deleteBus/{sn}")
	public ResponseEntity<Void> deleteBus(@PathVariable("sn") int serviceNum) {
		orangeBusService.deleteBus(serviceNum);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
