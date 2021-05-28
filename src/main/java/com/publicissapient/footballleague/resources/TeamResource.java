package com.publicissapient.footballleague.resources;

import com.publicissapient.footballleague.FootballLeagueConfig;
import com.publicissapient.footballleague.service.FootballLeagueService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/leagues/{leagueId}/teams")
public class TeamResource {
    private FootballLeagueService footballLeagueService;

    public TeamResource(FootballLeagueConfig configuration) {
        this.footballLeagueService = new FootballLeagueService(configuration);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTeams(@PathParam("leagueId") int leagueId){
        return Response.ok(footballLeagueService.getTeams(leagueId)).build();
    }
}
