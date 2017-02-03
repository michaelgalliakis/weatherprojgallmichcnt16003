package gr.teiath.weatherclasses;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    private int temp ;
    private int pressure ;
    private int humidity ;
    private int temp_min ;
    private int temp_max ;
    
    public Main() {
    }
    
    public Main(int temp, int pressure, int humidity, int temp_min, int temp_max) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }
    
    public int getTemp() {
        return temp;
    }
    
    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    public int getPressure() {
        return pressure;
    }
    
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    
    public int getHumidity() {
        return humidity;
    }
    
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    
    public int getTemp_min() {
        return temp_min;
    }
    
    public void setTemp_min(int temp_min) {
        this.temp_min = temp_min;
    }
    
    public int getTemp_max() {
        return temp_max;
    }
    
    public void setTemp_max(int temp_max) {
        this.temp_max = temp_max;
    }
    public String getHtmlTableCode()
    {
        return "<tr><th><b>Main:</b></th><td>Temp: "+getTemp()+"</td><td>Pressure: "+getPressure()+"</td>" +
                "<td>Humidity: "+getHumidity()+"</td><td>Temp_min: "+getTemp_min()+"</td><td>Temp_max: "+getTemp_max()+"</td><td></td></tr>\n" ;
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
