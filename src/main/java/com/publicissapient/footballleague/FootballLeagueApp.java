package com.publicissapient.footballleague;

import com.publicissapient.footballleague.resources.CountryResource;
import com.publicissapient.footballleague.resources.LeagueResource;
import com.publicissapient.footballleague.resources.StandingResource;
import com.publicissapient.footballleague.resources.TeamResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class FootballLeagueApp extends Application<FootballLeagueConfig> {
    public void run(FootballLeagueConfig configuration, Environment environment) throws Exception {
        environment.jersey().register(new CountryResource(configuration));
        environment.jersey().register(new LeagueResource(configuration));
        environment.jersey().register(new TeamResource(configuration));
        environment.jersey().register(new StandingResource(configuration));
    }

    public static void main(String[] args) throws Exception {
        //new FootballLeagueApp().run("server", "src/main/resources/appconfig.yaml");
        new FootballLeagueApp().run(args);
    }
}
