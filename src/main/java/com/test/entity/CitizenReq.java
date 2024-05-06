package com.test.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CitizenReq {
	private String citizenName;
	private LocalDate citizenDob;
	private Long citizenSsn;

}