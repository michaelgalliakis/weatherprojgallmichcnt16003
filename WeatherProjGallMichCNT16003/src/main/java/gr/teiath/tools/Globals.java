package gr.teiath.tools;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Globals {
    public static final ArrayList<ArrayList<String>> COUNTRIES_CODES_HTML_CODE = loadCountrieCodes();
    
    public static ArrayList<ArrayList<String>> loadCountrieCodes()
    {
        ClassLoader classLoader = Globals.class.getClassLoader();
        File file = new File(classLoader.getResource("textfile/iso3166-1.txt").getFile());
        ArrayList<ArrayList<String>> arCountriesCodes = new ArrayList() ;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] res = line.split("\\t+");
                ArrayList<String> ar = new ArrayList() ;
                ar.add(res[3].trim()) ;
                ar.add(res[0]) ;
                arCountriesCodes.add(ar);
            }
            scanner.close();
        } catch (Exception ex) {
            ArrayList<String> ar = new ArrayList() ;
            ar.add("GR") ;
            ar.add("Ελλάδα") ;
            arCountriesCodes.add(ar);
        }
        
        return arCountriesCodes ;
    }
    
    public static String loadHTMLCountrieCodes()
    {
        return loadHTMLCountrieCodes("GR") ;
    }
    
    public static String loadHTMLCountrieCodes(String currentCode)
    {
        String htmlSelectStr = "<select id=\"countryCode\" name=\"countryCode\">\n" ;
        for (ArrayList<String> ar : COUNTRIES_CODES_HTML_CODE)
        {
            if (ar.get(0).equals(currentCode))
                htmlSelectStr += "<option selected=\"selected\" value=\""+ar.get(0)+"\">"+ar.get(1)+"</option>\n" ;
            else
                htmlSelectStr += "<option value=\""+ar.get(0)+"\">"+ar.get(1)+"</option>\n" ;
            
            ar.get(0) ;
        }
        htmlSelectStr += "</select>\n" ;
        
        return htmlSelectStr ;
    }
    
    /**
     * Είναι μια συνάρτηση που ελέγχει αν μια συμβολοσειρά είναι αριθμός.
     * @param sNum Μια συμβολοσειρά για έλεγχο .
     * @return True αν είναι αριθμός η συμβολοσειρά ή False αν δεν είναι.
     */
    public static boolean isNumeric(String sNum)
    {
        double res ;
        try {
            res = Double.parseDouble(sNum);
        }
        catch (Exception ex)
        {
            //Nothing
            return false ;
        }
        return true ;
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
