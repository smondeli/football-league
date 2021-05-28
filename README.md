# football-league
Find standings of a team playing league football match using country name, league name and team name.

## End points
GET /v1/countries  
GET /v1/leagues  
GET /v1/leagues/{leagueId}/teams  
GET /v1/leagues/{leagueId}/standings?countryName=<countryName>&leagueName=<leagueName>&teamName=<teamName>  

## Build application
Run following maven command from project root directory.  
mvn clean install

## Dokerize Application
### Build Docker Image
Run following command from project root directory  
docker build -t football-league -f docker/Dockerfile .

### Create and Run Docker Container
docker run -d --name football-league -p 8080:8080 football-league   

### Check log
docker logs football-league  
