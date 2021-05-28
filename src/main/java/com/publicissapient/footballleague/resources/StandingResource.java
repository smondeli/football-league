package com.publicissapient.footballleague.resources;

import com.publicissapient.footballleague.FootballLeagueConfig;
import com.publicissapient.footballleague.service.FootballLeagueService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/leagues/{leagueId}/standings")
public class StandingResource {
    private FootballLeagueService footballLeagueService;

    public StandingResource(FootballLeagueConfig configuration) {
        this.footballLeagueService = new FootballLeagueService(configuration);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStandings(@PathParam ("leagueId") int leagueId,
                                 @QueryParam("countryName") String countryName,
                                 @QueryParam("leagueName") String leagueName,
                                 @QueryParam("teamName") String teamName){
        return Response.ok(footballLeagueService.getStandings(leagueId, countryName, leagueName, teamName)).build();
    }
}
