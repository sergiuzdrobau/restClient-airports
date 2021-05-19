package org.example.entity.helpingObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.example.entity.Flight;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightsEmbedded {

    private List<Flight> flights;

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "FlightsEmbedded{" +
                "flights=" + flights +
                '}';
    }
}
