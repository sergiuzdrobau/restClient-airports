package org.example.entity.helpingObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightsObject {
    private FlightsEmbedded _embedded;

    public FlightsEmbedded get_embedded() {
        return _embedded;
    }

    public void set_embedded(FlightsEmbedded _embedded) {
        this._embedded = _embedded;
    }

    @Override
    public String toString() {
        return "FlightsObject{" +
                "_embedded=" + _embedded +
                '}';
    }
}
