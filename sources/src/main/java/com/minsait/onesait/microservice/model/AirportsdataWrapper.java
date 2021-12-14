
package com.minsait.onesait.microservice.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * airportsdata
 * <p>
 * Ontology for notebook-dashboard example
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airportsdata"
})
public class AirportsdataWrapper {

    /**
     * Info EmptyBase
     * (Required)
     * 
     */
    @JsonProperty("airportsdata")
    @JsonPropertyDescription("Info EmptyBase")
    private Airportsdata airportsdata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Info EmptyBase
     * (Required)
     * 
     */
    @JsonProperty("airportsdata")
    public Airportsdata getAirportsdata() {
        return airportsdata;
    }

    /**
     * Info EmptyBase
     * (Required)
     * 
     */
    @JsonProperty("airportsdata")
    public void setAirportsdata(Airportsdata airportsdata) {
        this.airportsdata = airportsdata;
    }

    public AirportsdataWrapper withAirportsdata(Airportsdata airportsdata) {
        this.airportsdata = airportsdata;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AirportsdataWrapper withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
