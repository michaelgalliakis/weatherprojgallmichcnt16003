<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>    
        <jsp:include page="CommonFiles/header.jsp"/>            
    </head>
    <body >
        <div id="container">
            <div id="header">    
            </div>                                
            <div id="middle"> 
                    <div id="middle_inside">                     
                    <p align="left">  
                    <h3>Τίτλος: Τελική Εργασία - Πρόγνωση Καιρού </h3><br>
                    <b>Περιγραφή:</b> <br>

Στην ατομική εργασία αυτή καλείστε να χρησιμοποιήσετε το https://openweathermap.org/api για να αναπτύξετε ένα REST client ως εφαρμογή που θα εμφανίζει την πρόγνωση του καιρού. <hr>
 
Μπορείτε να βασιστείτε στο παράδειγμα που είδαμε στο εργαστήριο(https://bitbucket.org/amenychtas/weatherclient)<hr>
 
Ο χρήστης θα ερωτάται για την πόλη, τοποθεσία ή συντεταγμένες που επιθυμεί και θα εμφανίζονται οι σχετικές πληροφορίες για τις καιρικές συνθήκες ή μηνύματα λάθους. Κάθε φοιτητής στην εργασία του θα εμφανίζει διαφορετικές πληροφορίες:<hr>
 
16001, 16002, 16003: Call current weather data for one location 
(https://openweathermap.org/current) <br>
 
16004, 16005, 16006: Call 5 day / 3 hour forecast data 
(https://openweathermap.org/forecast5) <br>
 
16007, 16008, 16009: Call 16 day / daily forecast data
(https://openweathermap.org/forecast16) <br>
 
16010, 16011, 16012: Hourly historical data for cities 
(https://openweathermap.org/history)       <br><br>
<u>Ανδρέας Μενύχτας</u>
                    </div>
                <a href="index.jsp"><img src="Images/homebutton.png" height="150" width="250"></a>
            </div>                    
        </div>
        <jsp:include page="CommonFiles/footer.jsp"/>             
    </body>
</html>        
<%
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
%>