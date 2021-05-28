package com.publicissapient.footballleague;

import com.publicissapient.footballleague.service.FootballLeagueService;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class FootballLeagueServiceTest {
    private FootballLeagueConfig config = new FootballLeagueConfig();
    private String api = "https://apiv3.apifootball.com/";
    private String apiKey = "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";

    @Test
    public void test() {
        config.setApi(api);
        config.setApiKey(apiKey);
        int count = new FootballLeagueService(config).getCountries().size();
        assertTrue(count > 0);
    }

    @Test
    public void testLeagues() {
        config.setApi(api);
        config.setApiKey(apiKey);
        int count = new FootballLeagueService(config).getLeagues().size();
        assertTrue(count > 0);
    }

    @Test
    public void testTeam() {
        config.setApi(api);
        config.setApiKey(apiKey);
        int count = new FootballLeagueService(config).getTeams(6).size();
        assertTrue(count > 0);
    }

    @Test
    public void testStanding() {
        config.setApi(api);
        config.setApiKey(apiKey);
        int count = new FootballLeagueService(config).getStandings(6, "France", "Feminine Division 1", "Paris SG W").size();
        assertTrue(count > 0);
    }
}
