package gr.teiath.weatherclasses;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MyWeather {
    private Coord coord ;
    private Weather[] weather ;
    private String base ;
    private Main main ;
    private int visibility ;
    private Wind wind ;
    private Clouds clouds ;
    private Rain rain ;
    private Snow snow ;
    private int dt ;
    private Sys sys ;
    private int id ;
    private String name ;
    private int cod ;
    
    public MyWeather() {
    }
    
    public MyWeather(Coord coord, Weather[] weather, String base, Main main, int visibility, Wind wind, Clouds clouds, Rain rain, Snow snow, int dt, Sys sys, int id, String name, int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.rain = rain;
        this.snow = snow;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }
    
    public String getHtmlTableCode()
    {
        String tmp = "<center><h3>All Info (by Json):</h3><table>" + ((getNameHtmlTableCode()!=null)?getNameHtmlTableCode():"") ;
        tmp +=((getCodHtmlTableCode()!=null)?getCodHtmlTableCode():"") ;
        if (getWeather()!=null)
            for (Weather w : getWeather())
                tmp += ((w!=null)?w.getHtmlTableCode():"");
        
        tmp += ((getCoord()!=null)?getCoord().getHtmlTableCode():"") +
                ((getBaseHtmlTableCode()!=null)?getBaseHtmlTableCode():"") +
                ((getMain()!=null)?getMain().getHtmlTableCode():"") +
                ((getWind()!=null)?getWind().getHtmlTableCode():"") +
                ((getClouds()!=null)?getClouds().getHtmlTableCode():"") +
                ((getRain()!=null)?getRain().getHtmlTableCode():"") +
                ((getSnow()!=null)?getSnow().getHtmlTableCode():"") +
                ((getDtHtmlTableCode()!=null)?getDtHtmlTableCode():"") +
                ((getSys()!=null)?getSys().getHtmlTableCode():"") +
                ((getIdHtmlTableCode()!=null)?getIdHtmlTableCode():"") +
                "</table></center>" ;
        
        return tmp ;
    }
    
    public String getBaseHtmlTableCode()
    {
        return "<tr><th><b>Base:</b></th><td>"+getBase()+"</td><td></td><td></td><td></td><td></td><td></td></tr>\n" ;
    }
    
    public String getDtHtmlTableCode()
    {
        return "<tr><th><b>Dt:</b></th><td>"+getDt()+"</td><td></td><td></td><td></td><td></td><td></td></tr>\n" ;
    }
    
    public String getIdHtmlTableCode()
    {
        return "<tr><th><b>ID:</b></th><td>"+getId()+"</td><td></td><td></td><td></td><td></td><td></td></tr>\n" ;
    }
    
    public String getNameHtmlTableCode()
    {
        return "<tr><th><b>Name:</b></th><td>"+getName()+"</td><td></td><td></td><td></td><td></td><td></td></tr>\n" ;
    }
    
    public String getCodHtmlTableCode()
    {
        return "<tr><th><b>Cod:</b></th><td>"+getCod()+"</td><td></td><td></td><td></td><td></td><td></td></tr>\n" ;
    }
    
    public Coord getCoord() {
        return coord;
    }
    
    public void setCoord(Coord coord) {
        this.coord = coord;
    }
    
    public Weather[] getWeather() {
        return weather;
    }
    
    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }
    
    public String getBase() {
        return base;
    }
    
    public void setBase(String base) {
        this.base = base;
    }
    
    public Main getMain() {
        return main;
    }
    
    public void setMain(Main main) {
        this.main = main;
    }
    
    public int getVisibility() {
        return visibility;
    }
    
    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
    
    public Wind getWind() {
        return wind;
    }
    
    public void setWind(Wind wind) {
        this.wind = wind;
    }
    
    public Clouds getClouds() {
        return clouds;
    }
    
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }
    
    public int getDt() {
        return dt;
    }
    
    public void setDt(int dt) {
        this.dt = dt;
    }
    
    public Sys getSys() {
        return sys;
    }
    
    public void setSys(Sys sys) {
        this.sys = sys;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public Rain getRain() {
        return rain;
    }
    
    public void setRain(Rain rain) {
        this.rain = rain;
    }
    
    public Snow getSnow() {
        return snow;
    }
    
    public void setSnow(Snow snow) {
        this.snow = snow;
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