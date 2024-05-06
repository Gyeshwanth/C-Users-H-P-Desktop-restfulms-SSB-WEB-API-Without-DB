package com.test.rest;

import org.springframework.web.bind.annotation.RestController;

import com.test.binding.CitizenRepsone;
import com.test.entity.CitizenReq;
import com.test.execption.CitizenDetailsNotFound;
import com.test.service.CitizenService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CitizenController {

    private static final Logger logger = LoggerFactory.getLogger(CitizenController.class);

	@Autowired
	private CitizenService citizenService;
	
	@PostMapping("/citizen-details")
	public ResponseEntity<?> getCitizenState(@RequestBody CitizenReq citizenReq ) throws CitizenDetailsNotFound {
	    logger.info("Received request to fetch citizen details for SSN: {}", citizenReq.getCitizenSsn());

	    CitizenRepsone citizenRepsone = citizenService.getCitizenState(citizenReq.getCitizenSsn());
	    if(citizenRepsone.getCitizenState() == null) {
	        logger.warn("Invalid SSN provided: {}", citizenReq.getCitizenSsn());
	        throw new CitizenDetailsNotFound("Please Use Valid SSN");
	    }

	    logger.info("Returning citizen details for SSN: {}", citizenReq.getCitizenSsn());
	    return new ResponseEntity<>(citizenRepsone, HttpStatus.OK);
	}
}

	
	
