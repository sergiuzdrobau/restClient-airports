package org.example.entity.helpingObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.example.entity.Airline;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirlinesEmbedded {

    private List<Airline> airlines;

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    @Override
    public String toString() {
        return "AirlinesEmbedded{" +
                "airlines=" + airlines +
                '}';
    }
}
