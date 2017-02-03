package gr.teiath.weatherclasses;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ManageWeather {
    public enum Status {
        loadedOK,
        error,
        firstTime
    }
    
    private static final String OPENWEATHERMAP_LINK ="http://api.openweathermap.org" ;
    private static final String OPENWEATHERMAP_PATH ="data/2.5/weather" ;
    private static final String OPENWEATHERMAP_APPID ="27f1950a3b8b487e7375f6266e463aa5" ;
    private static final String OPENWEATHERMAP_UNITS = "metric" ;
    
    private MyWeather weather ;
    private Status status ;
    
    public ManageWeather(){
        status = Status.firstTime ;
    }
    public Status loadWheather(String location){
        try
        {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(OPENWEATHERMAP_LINK)
                    .path(OPENWEATHERMAP_PATH)
                    .queryParam("q", location)
                    .queryParam("appid",OPENWEATHERMAP_APPID)
                    .queryParam("units", OPENWEATHERMAP_UNITS);
            
            Response response = target
                    .request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get();
            
            weather = response.readEntity(MyWeather.class);
            
            status = Status.loadedOK ;
            return status ;
            
        }
        catch(Exception ex)
        {
            status = Status.error ;
            return status ;
        }
    }
    
    public Status loadWheather(double lat, double lon){
        try
        {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(OPENWEATHERMAP_LINK)
                    .path(OPENWEATHERMAP_PATH)
                    .queryParam("lat", lat)
                    .queryParam("lon", lon)
                    .queryParam("appid",OPENWEATHERMAP_APPID)
                    .queryParam("units", OPENWEATHERMAP_UNITS);
            
            Response response = target
                    .request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get();
            
            weather = response.readEntity(MyWeather.class);
            
            status = Status.loadedOK ;
            return status ;
            
        }
        catch(Exception ex)
        {
            System.out.println("ERRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOORRRRR");
            status = Status.error ;
            return status ;
        }
    }
    
    public MyWeather getWeather() {
        return weather;
    }
    
    public void setWeather(MyWeather weather) {
        this.weather = weather;
    }
    
    
    
    public Status getStatus() {
        return status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    
    public static String getStrStatus(Status st)
    {
        switch(st) {
            case loadedOK :
                return "OK! (Weather loaded)" ;
            case error :
                return "ERROR! (Weather loaded)" ;
            case firstTime :
                return "FAIL! (First tile)" ;
            default:
                return "Something Else!" ;
        }
    }
}
/*
* * * * * * * * * * * * * * * * * * * * * * *
* + + + + + + + + + + + + + + + + + + + + + *
* +- - - - - - - - - - - - - - - - - - - -+ *
* +| P P P P    M M     M M    G G G G   |+ *
* +| P      P   M  M   M  M   G       G  |+ *
* +| P P P p    M   M M   M  G           |+ *
* +| P          M    M    M  G    G G G  |+ *
* +| P          M         M   G       G  |+ *
* +| P        ® M         M ®  G G G G   |+ *
* +- - - - - - - - - - - - - - - - - - - -+ *
* +           .----.   @   @             |+ *
* +          / .-"-.`.  \v/              |+ *
* +          | | '\ \ \_/ )              |+ *
* +        ,-\ `-.' /.'  /               |+ *
* +       '---`----'----'                |+ *
* +- - - - - - - - - - - - - - - - - - - -+ *
* + + + + + + + + + + + + + + + + + + + + + *
* +- - - - - - - - - - - - - - - - - - - -+ *
* +|        Michael Galliakis 2017       |+ *
* +| Program m_g ; -) cnt16003@teiath.gr |+ *
* +|     TEI Athens - IT department.     |+ *
* +|    M.Sc.in Computing and Network    |+ *
* +|            Technologies.            |+ *
* +|       michaelgalliakis@yahoo.gr     |+ *
* +| https://github.com/michaelgalliakis |+ *
* +- - - - - - - - - - - - - - - - - - - -+ *
* + + + + + + + + + + + + + + + + + + + + + *
* * * * * * * * * * * * * * * * * * * * * * *
*/