package gr.teiath.weatherclasses;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {
    private int speed ;
    private int deg ;
    
    public Wind() {
    }
    
    public Wind(int speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }
    
    public String getHtmlTableCode()
    {
        return "<tr><th><b>Wind:</b></th><td>Deg: "+getDeg()+"</td><td>Speed: "+getSpeed()+"</td><td></td><td></td><td></td><td></td></tr>\n" ;
    }
    
    public int getDeg() {
        return deg;
    }
    
    public void setDeg(int deg) {
        this.deg = deg;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
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