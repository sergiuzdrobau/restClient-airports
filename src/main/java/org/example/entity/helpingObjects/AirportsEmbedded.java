package org.example.entity.helpingObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.entity.Airport;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirportsEmbedded {

    private List<Airport> airports;

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    @Override
    public String toString() {
        return "AirportsEmbedded{" +
                "airports=" + airports +
                '}';
    }
}
