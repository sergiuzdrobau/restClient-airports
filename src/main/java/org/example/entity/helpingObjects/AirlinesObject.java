package org.example.entity.helpingObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirlinesObject {


    private AirlinesEmbedded _embedded;

    public AirlinesEmbedded get_embedded() {
        return _embedded;
    }

    public void set_embedded(AirlinesEmbedded _embedded) {
        this._embedded = _embedded;
    }

    @Override
    public String toString() {
        return "AirlinesObject{" +
                "_embedded=" + _embedded +
                '}';
    }
}


