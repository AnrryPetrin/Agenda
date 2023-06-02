/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

import java.util.Calendar;

/**
 *
 * @author anrry
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // testando como seria o funcionamento das datas na agenda
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
       
        c1.set(2020, 05, 1);
        c2.set(2020, 05, 1);
        c1.compareTo(c2);

    }
    
}
