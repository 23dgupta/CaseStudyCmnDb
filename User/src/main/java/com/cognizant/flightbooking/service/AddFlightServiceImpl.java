package com.cognizant.flightbooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.flightbooking.entity.AddFlightDetails;
import com.cognizant.flightbooking.exception.ResourceNotFoundException;
import com.cognizant.flightbooking.repo.AddFlightRepository;

@Service
public class AddFlightServiceImpl implements IAddFlightService {

	@Autowired
	AddFlightRepository flightRepository;

	@Override
	public AddFlightDetails bookFlight(AddFlightDetails addFlight) {
		// TODO Auto-generated method stub
		return flightRepository.save(addFlight);
	}

//	@Override
//	public List<AddFlightDetails> getAllFlight() {
//		// TODO Auto-generated method stub
//		return flightRepository.findAll();
//	}

//	@Override
//	public AddFlightDetails getFlight(String flightName) {
//		// TODO Auto-generated method stub
//		return  flightRepository.findByOperatingAirlines(flightName)
//				.orElseThrow(() -> new ResourceNotFoundException("flightName not found"));
//
//	}

//	@Override
//	public AddFlightDetails getflightNumber(Integer flightNumber) {
//		// TODO Auto-generated method stub
//		return flightRepository.findByFlightNumber(flightNumber).get();
//
//	}


	
//	@Override
//	public void deleteFlightById(Integer flightNumber) {
//		// TODO Auto-generated method stub
//		//deleteFlightById
//		AddFlightDetails existingflightNumber = getflightNumber(flightNumber);
//
//		flightRepository.delete(existingflightNumber);
//	}

//	@Override
//	public Integer updateFlight(AddFlightDetails addFlight, Integer flightNumber) {
//		 AddFlightDetails existingFlight = getflightNumber(flightNumber);
//		 existingFlight.setId(addFlight.getId()!=null ?addFlight.getId() : existingFlight.getId());
//		 existingFlight.setFlightNumber(addFlight.getFlightNumber()!=null ? addFlight.getFlightNumber() :existingFlight.getFlightNumber());
//		 existingFlight.setOperatingAirlines(addFlight.getOperatingAirlines()!=null ? addFlight.getOperatingAirlines() :existingFlight.getOperatingAirlines());
//		
//		 existingFlight.setFromPlace(addFlight.getFromPlace()!=null ? addFlight.getFromPlace() :existingFlight.getFromPlace());
//		 existingFlight.setToPlace(addFlight.getToPlace()!=null ? addFlight.getToPlace() :existingFlight.getToPlace());
//		 existingFlight.setStartDate(addFlight.getStartDate()!=null ? addFlight.getStartDate() :existingFlight.getStartDate());
//		 existingFlight.setEndDate(addFlight.getEndDate()!=null ? addFlight.getEndDate() :existingFlight.getEndDate());
//		 existingFlight.setScheduleDays(addFlight.getScheduleDays()!=null ? addFlight.getScheduleDays() :existingFlight.getScheduleDays());
//		 existingFlight.setBusinessSeats(addFlight.getBusinessSeats()!=null ? addFlight.getBusinessSeats() :existingFlight.getBusinessSeats());
//		 existingFlight.setNonBusinessSeats(addFlight.getNonBusinessSeats()!=null ? addFlight.getNonBusinessSeats() :existingFlight.getNonBusinessSeats());
//		 existingFlight.setCost(addFlight.getCost()!=null ? addFlight.getCost() :existingFlight.getCost());
//		 existingFlight.setDateOfDeparture(addFlight.getDateOfDeparture()!=null ? addFlight.getDateOfDeparture() :existingFlight.getDateOfDeparture());
//		flightRepository.save(existingFlight);
//
//		return existingFlight.getFlightNumber();
//	}

	
	@Override
	
	public List<AddFlightDetails> searchFlight(String fromPlace, String toPlace,  Date startDate) {
				return flightRepository.searchFlight(fromPlace, toPlace,startDate);
	}



}
