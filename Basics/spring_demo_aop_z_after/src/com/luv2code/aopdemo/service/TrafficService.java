package com.luv2code.aopdemo.service;

import org.springframework.stereotype.Component;

@Component
public class TrafficService {
	public String getDelay() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Delay ho gaya";
	}

	public String getDelay(boolean tripWire) {
		// TODO Auto-generated method stub
		if(tripWire) {
			// The exception is the message : "High way ahead : DANGER ZONE"
			throw new RuntimeException("High way ahead : DANGER ZONE");
		}
		return getDelay();
	}

}
