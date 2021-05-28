package com.publicissapient.footballleague.service;

import com.publicissapient.footballleague.FootballLeagueConfig;
import com.publicissapient.footballleague.dto.Country;
import com.publicissapient.footballleague.dto.League;
import com.publicissapient.footballleague.dto.Standing;
import com.publicissapient.footballleague.dto.Team;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FootballLeagueService {
    private FootballLeagueConfig configuration;
    public FootballLeagueService(FootballLeagueConfig configuration) {
        this.configuration = configuration;
    }

    public List<Country> getCountries(){
        Client client = ClientBuilder.newClient();
        List<Country> countries  = new ArrayList<>();
        try{
            countries.addAll(client.target(configuration.getApi()+"?action=get_countries&APIkey="+configuration.getApiKey())
                    .request().get().readEntity(new GenericType<List<Country>>() {}));
        }finally {
            if(Optional.of(client).isPresent()){
                client.close();
            }
        }
        return countries;
    }

    public List<League> getLeagues(){
        Client client = ClientBuilder.newClient();
        List<League> leagues = new ArrayList<>();
        try{
            leagues.addAll(client.target(configuration.getApi()+"?action=get_leagues&APIkey="+configuration.getApiKey())
                    .request().get().readEntity(new GenericType<List<League>>() {}));
        }finally {
            if(Optional.of(client).isPresent()){
                client.close();
            }
        }
        return leagues;
    }

    public List<Team> getTeams(int leagueId) {
        Client client = ClientBuilder.newClient();
        List<Team> teams = new ArrayList<>();
        try{
            teams.addAll(client.target(configuration.getApi()+"?action=get_teams&league_id="+leagueId+"&APIkey="+configuration.getApiKey())
                    .request().get().readEntity(new GenericType<List<Team>>() {}));
        }finally {
            if(Optional.ofNullable(client).isPresent()){
                client.close();
            }
        }
        return teams;
    }

    public List<Standing> getStandings(int leagueId, String countryName, String leagueName, String teamName) {
        Client client = ClientBuilder.newClient();
        List<Standing> standings = new ArrayList<>();
        try{
            Response response = client.target(configuration.getApi()+"?action=get_standings&league_id="+leagueId+"&APIkey="+configuration.getApiKey())
                    .request().get();
            if (response.getStatus() == 200){
                standings.addAll(response.readEntity(new GenericType<List<Standing>>() {}));
            }
        }catch (Exception e){
            //Handle exception
        }finally {
            if(Optional.ofNullable(client).isPresent()){
                client.close();
            }
        }

        if(Optional.ofNullable(countryName).isPresent()){
            standings = standings.stream().filter(standing -> countryName.equalsIgnoreCase(standing.getCountryName())).collect(Collectors.toList());
        }
        if(Optional.ofNullable(leagueName).isPresent()){
            standings = standings.stream().filter(standing -> leagueName.equalsIgnoreCase(standing.getLeagueName())).collect(Collectors.toList());
        }
        if(Optional.ofNullable(teamName).isPresent()){
            standings = standings.stream().filter(standing -> teamName.equalsIgnoreCase(standing.getTeamName())).collect(Collectors.toList());
        }
        if(standings.size() > 0){
            List<Country> countries = getCountries();
            for(Standing standing : standings){
                standing.setCountryId(getCountryId(countries, standing.getCountryName()));
            }
        }
        return standings;
    }

    private int getCountryId(List<Country> countries, String countryName){
        countries = countries.stream().filter(c -> countryName.equalsIgnoreCase(c.getCountryName())).collect(Collectors.toList());
        if(countries.size() > 0){
            return countries.get(0).getCountryId();
        }else{
            return 0;
        }
    }
}
