package com.test.service;

import org.springframework.stereotype.Service;

import com.test.binding.CitizenRepsone;


@Service
public class CitizenServiceImpl implements CitizenService {

	
	
	@Override
	public CitizenRepsone getCitizenState(Long citizenSsn) {
		CitizenRepsone citizenRepsone = new CitizenRepsone();
		String ssn = String.valueOf(citizenSsn);
		
		if(ssn.startsWith("1")) {
			citizenRepsone.setCitizenState("New Jersey");
		}
		if(ssn.startsWith("2")) {
			citizenRepsone.setCitizenState("Texas");
		}
		if(ssn.startsWith("3")) {
			citizenRepsone.setCitizenState("Ohio");
		}
		if(ssn.startsWith("4")) {
			citizenRepsone.setCitizenState("Rhode Island");
		}
		if(ssn.startsWith("5")) {
			citizenRepsone.setCitizenState("Kentucky");
		}
		if(ssn.startsWith("6")) {
			citizenRepsone.setCitizenState("Albama");
		}if(ssn.startsWith("7")) {
			citizenRepsone.setCitizenState("Alaska");
		}if(ssn.startsWith("8")) {
			citizenRepsone.setCitizenState("California");
		}
		if(ssn.startsWith("9")) {
			citizenRepsone.setCitizenState("Georgia");
		}
		citizenRepsone.setCitizenSsn(citizenSsn);
		
		return citizenRepsone;
	}

}