
package com.minsait.onesait.microservice.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Info EmptyBase
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "city",
    "country",
    "IATAFAA",
    "latitude",
    "longitude",
    "tz"
})
public class Airportsdata {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("IATAFAA")
    private String iATAFAA;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    private String latitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    private String longitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tz")
    private String tz;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Airportsdata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Airportsdata withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Airportsdata withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("IATAFAA")
    public String getIATAFAA() {
        return iATAFAA;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("IATAFAA")
    public void setIATAFAA(String iATAFAA) {
        this.iATAFAA = iATAFAA;
    }

    public Airportsdata withIATAFAA(String iATAFAA) {
        this.iATAFAA = iATAFAA;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Airportsdata withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Airportsdata withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tz")
    public String getTz() {
        return tz;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tz")
    public void setTz(String tz) {
        this.tz = tz;
    }

    public Airportsdata withTz(String tz) {
        this.tz = tz;
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

    public Airportsdata withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
