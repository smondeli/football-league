package com.publicissapient.footballleague.resources;

import com.publicissapient.footballleague.FootballLeagueConfig;
import com.publicissapient.footballleague.service.FootballLeagueService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/leagues")
public class LeagueResource {
    private FootballLeagueService footballLeagueService;

    public LeagueResource(FootballLeagueConfig configuration) {
        this.footballLeagueService = new FootballLeagueService(configuration);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCountries(){
        return Response.ok(footballLeagueService.getLeagues()).build();
    }
}
