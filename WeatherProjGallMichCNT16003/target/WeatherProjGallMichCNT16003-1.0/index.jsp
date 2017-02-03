<%@page import="gr.teiath.tools.Globals"%>
<%@page import="gr.teiath.weatherclasses.Weather"%>
<%@page import="gr.teiath.weatherclasses.ManageWeather"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%   
    String option = "Location";
    if (request.getParameter("Option") != null) {
	option = request.getParameter("Option");        
    }
    String word = "Athens";    
    if (request.getParameter("word") != null) {
	word = request.getParameter("word");     
    }
    String countryCode = "GR";
    if (request.getParameter("countryCode") != null) {
	countryCode = request.getParameter("countryCode");        
    }    
    Double lon = null;    
    Double lat = null;    
    if (request.getParameter("lonStr") != null && Globals.isNumeric(request.getParameter("lonStr")) &&
            request.getParameter("latStr") != null && Globals.isNumeric(request.getParameter("latStr"))) {	 
	lon = Double.parseDouble(request.getParameter("lonStr"));     
        lat = Double.parseDouble(request.getParameter("latStr"));     
    }    	    
%>       
<html>
    <head>    
        <jsp:include page="CommonFiles/header.jsp"/>            
    </head>
    <body >
        <div id="container">
            <div id="header">    
            </div>                                
            <div id="middle">       
                <br>        
                <div class="mydiv"> 
                      <h2>Καλώς ήρθατε </h2><br>
                        <i><u>Το Website είναι μια REST client εφαρμογή, που εμφανίζει την πρόγνωση του καιρού.</u></i><br>                      
                        (Τα δεδομένα του καιρού είναι από το API της <a href="https://openweathermap.org/">Openweathermap</a>
                        & οι χάρτες από την <a href="https://www.google.gr/maps/">Google</a>)
                        <img src="Images/master96.png">
                </div>               
                <h4>Αναζήτηση (με βάση):</h4>
                <form name="find" role="form" method="post" action="index.jsp">                                       
                    <label for="Location">Τοποθεσία/Τ.Κ</label>
                    <input id="Location" name="Option" value="Location" <%=option.equals("Location")?"checked='checked'":""%> type="radio"  onchange="reload();">
                    <label for="LonLat">Συντεταγμένες:</label>  
                     <input id="LonLat" name="Option" value="LonLat" <%=option.equals("LonLat")?"checked='checked'":""%> type="radio" onchange="reload();">
                     <div id="LonLatAll"  <%=!option.equals("LonLat")?"disabled='true'":""%> <%=!option.equals("LonLat")?"style='visibility:collapse;'":""%>>
                    <label for="Lon">(Lon:</label>
                    <input id="Lon" name="lonStr"  class="" maxlength="25" type="number" step="0.00000001" value="<%=(lon!=null)?lon:0%>" size="10">) 
                    <label for="Lat">(Lat:</label>                    
                    <input id="Lat" name="latStr"  class="" maxlength="25" type="number" step="0.00000001" value="<%=(lat!=null)?lat:0%>" size="10">)<br>       
                     </div>
                     <div id="LocationAll" <%=!option.equals("Location")?"disabled='true'":""%> <%=!option.equals("Location")?"style='visibility:collapse;'":""%>>
                    <input id="textinputID" name="word"  class="textinput" maxlength="25" type="text" value="<%=word%>" autofocus> <br>                      
                    <%=gr.teiath.tools.Globals.loadHTMLCountrieCodes(countryCode)%> 
                    <input id="resGR" class="resetGR" name="ResGR" value="" type="button" onclick="resetGR();">
                     </div>
                    <center>                                
                        <input type="submit" class="find" value="" >                                                                                               
                        <hr/>        
                    </center>
                </form>                   
            <%
                ManageWeather mw = new ManageWeather() ;
                if (option.equals("LonLat") && lon!=null && lat!=null)                                     
                    mw.loadWheather(lon,lat) ;                         
                else
                    mw.loadWheather(word+","+countryCode) ;   
                                 %>
                <div id="middle_Max1">   
            <%    if (mw.getStatus().equals(ManageWeather.Status.loadedOK) && mw.getWeather()!=null && mw.getWeather().getCoord()!=null) {   %>        
                    <div id="slide">   
                        <h2><u>Highlights:</u></h2><hr>
                        <div class="mydiv">
                            <b> <%=mw.getWeather().getName()%></b>
                            <img src="Images/ForJson/Location.png" height="24" width="24"/><br>
                        </div><hr><hr>
            <%
                   
                    if (mw.getWeather().getWeather()!=null)
                        for (Weather w : mw.getWeather().getWeather()) {                
            %>
                        <b> <%=w.getIconHtmlCode(true)%></b><hr>
                        <div class="mydiv">
                        <b> <%=w.getDescription()%></b>
                        <img src="Images/ForJson/Description.png" height="24" width="24"/><br>
                        </div><hr>
                        <div class="mydiv">
                            <b> <%=w.getMain()%></b>
                            <img src="Images/ForJson/Info.png" height="24" width="24"/><br>
                        </div><hr>                        
            <%          } %>    
                        <hr>
                        <div class="mydiv">
                            <b> <%=mw.getWeather().getMain().getTemp()%></b>
                            <img src="Images/ForJson/Temperature.png" height="24" width="24"/><br>
                        </div><hr>
                        <div class="mydiv">
                            <b> <%=mw.getWeather().getMain().getTemp_max()%></b>
                            <img src="Images/ForJson/MaxTemp.png" height="24" width="24"/><br>
                        </div><hr>
                        <div class="mydiv">
                            <b> <%=mw.getWeather().getMain().getTemp_min()%></b>
                            <img src="Images/ForJson/MinTemp.png" height="24" width="24"/><br>
                        </div><hr>
                        <div class="mydiv">
                            <b> <%=mw.getWeather().getMain().getHumidity()%></b>
                            <img src="Images/ForJson/Humidity.png" height="24" width="24"/><br>
                        </div><hr>
                        <div class="mydiv">
                            <b> <%=mw.getWeather().getSys().getCountry()%></b>
                            <img src="Images/ForJson/Country.png" height="24" width="24"/><br>
                        </div><hr>
                    </div>
                    <div id="quick_note">               
                    Χάρτης(Lat:<%=mw.getWeather().getCoord().getLat()%>,Lon:<%=mw.getWeather().getCoord().getLon()%>):  <br>              
                    <iframe width="350" height="430" frameborder="0" style="border:0" 
                        src="https://www.google.com/maps/embed/v1/place?q=<%=mw.getWeather().getCoord().getLat()%>,<%=mw.getWeather().getCoord().getLon()%>&amp;key=AIzaSyDUHXjO4UWew8ht-h4iL3tHulB3w6_h5Xc"></iframe> 
                    </div>
                </div>                                         
        <%     
                  }
                  if (mw.getStatus().equals(ManageWeather.Status.loadedOK)) {
                     out.println(mw.getWeather().getHtmlTableCode()) ;
                  }        
                  else
                     out.println("<font color=\"red\" size=\"-1\"><h2>Υπήρξε κάποιο Σφάλμα</h2></font>") ;
        %>          
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