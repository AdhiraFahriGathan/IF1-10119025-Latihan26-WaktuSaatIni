/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan26.waktusaatini;

import static if1.pkg10119025.latihan26.waktusaatini.Main.lokal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    static Date date = new Date();
    static Locale lokal = Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss",lokal);
    
    private static void tampilanWaktu(){
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { tampilanWaktu();}
        // TODO code application logic here
    }
    

