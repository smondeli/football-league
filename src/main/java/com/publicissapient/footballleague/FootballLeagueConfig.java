package com.publicissapient.footballleague;

import io.dropwizard.Configuration;

public class FootballLeagueConfig extends Configuration {
    private String api;
    private String apiKey;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
