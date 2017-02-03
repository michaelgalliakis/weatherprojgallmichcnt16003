function disableLonLat()
{        
    document.getElementById("Lon").value = 0.0 ;
    document.getElementById("Lat").value = 0.0 ;
       
    document.getElementById('LonLatAll').disabled = true ;              
    document.getElementById('LonLatAll').style.visibility = 'collapse';
           
    document.getElementById("LocationAll").disabled = false;       
    document.getElementById('LocationAll').style.visibility = 'visible';      
    
    document.getElementById("textinputID").focus(); 
}
function enableLonLat()
{            
    document.getElementById("textinputID").value = "";        
    
    document.getElementById('LonLatAll').disabled = false;  
    document.getElementById('LonLatAll').style.visibility = 'visible';    
           
    document.getElementById("LocationAll").disabled = true;               
    document.getElementById('LocationAll').style.visibility = 'collapse';        
    
    document.getElementById("Lon").focus();
}
function reload()
{   
    if (document.getElementById("LonLat").checked === true)          
        enableLonLat() ;               
    else
        disableLonLat() ;          
}

function resetGR() {
    var options = document.getElementById("countryCode").options;     
    for (var i=0, iLen=options.length; i<iLen; i++) {
        if (options[i].value==="GR") {
            document.getElementById("countryCode").selectedIndex = i;
            return;
        }
    }
    
    document.getElementById("countryCode").selectedIndex = 0;
}

