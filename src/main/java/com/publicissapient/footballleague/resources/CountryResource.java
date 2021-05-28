package com.publicissapient.footballleague.resources;

import com.publicissapient.footballleague.FootballLeagueConfig;
import com.publicissapient.footballleague.service.FootballLeagueService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/countries")
public class CountryResource {
    private FootballLeagueService footballLeagueService;

    public CountryResource(FootballLeagueConfig configuration) {
        this.footballLeagueService = new FootballLeagueService(configuration);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCountries(){
        return Response.ok(footballLeagueService.getCountries()).build();
    }
}
