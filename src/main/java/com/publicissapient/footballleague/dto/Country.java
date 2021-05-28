package com.publicissapient.footballleague.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
    @JsonProperty("country_id")
    private int countryId;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("country_logo")
    private String countryLogo;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryLogo() {
        return countryLogo;
    }

    public void setCountryLogo(String countryLogo) {
        this.countryLogo = countryLogo;
    }
}
