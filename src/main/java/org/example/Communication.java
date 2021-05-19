package org.example;

import org.example.entity.*;
import org.example.entity.helpingObjects.AirlinesObject;
import org.example.entity.helpingObjects.AirportsObject;
import org.example.entity.helpingObjects.FlightsObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;

    // Airports Client REST
    private final String AirportsURL = "http://localhost:8080/airports";

    public List<Airport> getAllAirports(){
        ResponseEntity<AirportsObject> responseEntity = restTemplate.exchange(AirportsURL, HttpMethod.GET, null
                , new ParameterizedTypeReference<AirportsObject>() {});
        AirportsObject airports = responseEntity.getBody();
        return  airports.get_embedded().getAirports();

    }

    public Airport getAirportById(int id){
        Airport airport = restTemplate.getForObject(AirportsURL+"/"+id, Airport.class);
        return airport;
    }

    public void saveAirport(Airport airport){
        int id = airport.getId();
        if (id == 0){
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(AirportsURL, airport, String.class);
            System.out.println("Airport added");
            System.out.println(responseEntity.getBody());
        }
        else {
            restTemplate.put(AirportsURL+"/"+id, airport);
            System.out.println("Airport with id= "+id+" was updated");
        }
    }

    public void deleteAirport(int id){
        restTemplate.delete(AirportsURL+"/"+id);
        System.out.println("Airport with Id = "+id+" was Deleted");
    }

    // Airlines Client REST
    private final String AirlinesURL = "http://localhost:8080/airlines";

    public List<Airline> getAllAirlines(){
        ResponseEntity<AirlinesObject> responseEntity = restTemplate.exchange(AirlinesURL, HttpMethod.GET, null
                , new ParameterizedTypeReference<AirlinesObject>() {});
        AirlinesObject airlines = responseEntity.getBody();
        return airlines.get_embedded().getAirlines();
    }

    public Airline getAirlineById(int id){
        Airline airline = restTemplate.getForObject(AirlinesURL+"/"+id, Airline.class);
        return airline;
    }

    public void saveAirline(Airline airline){
        int id = airline.getId();
        if (id == 0){
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(AirlinesURL, airline, String.class);
            System.out.println("Airline added");
            System.out.println(responseEntity.getBody());
        }
        else {
            restTemplate.put(AirlinesURL+"/"+id, airline);
            System.out.println("Airline with id= "+id+" was updated");
        }
    }

    public void deleteAirline(int id){
        restTemplate.delete(AirlinesURL+"/"+id);
        System.out.println("Airline with Id = "+id+" was Deleted");
    }

    //Flights Client REST
    private final String FlightsURL = "http://localhost:8080/flights";

    public List<Flight> getAllFlights(){
        ResponseEntity<FlightsObject> responseEntity = restTemplate.exchange(FlightsURL, HttpMethod.GET, null
                , new ParameterizedTypeReference<FlightsObject>() {});
        FlightsObject flights = responseEntity.getBody();
        return flights.get_embedded().getFlights();
    }

    public Flight getFlightById(int id){
        Flight flight = restTemplate.getForObject(FlightsURL+"/"+id, Flight.class);
        return flight;
    }

    public void saveFlight(Flight flight){
        int id = flight.getId();
        if (id == 0){
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(FlightsURL, flight, String.class);
            System.out.println("Flight added");
            System.out.println(responseEntity.getBody());
        }
        else {
            restTemplate.put(FlightsURL+"/"+id, flight);
            System.out.println("Flight with id= "+id+" was updated");
        }
    }

    public void deleteFlight(int id){
        restTemplate.delete(FlightsURL+"/"+id);
        System.out.println("Flight with Id = "+id+" was Deleted");
    }



}
