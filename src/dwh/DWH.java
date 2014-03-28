/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwh;

import dwhSkaner.dwhSkaner;
import java.util.Scanner;

/**
 * Klasa testująca działanie (póki co skanera)
 * 
 */
public class DWH {

    /**
     * Buduje skaner oraz obiekt potrzebny do wczytywania z konsoli, 
     * Komunikuje się z użytkownikiem i pobiera dane
     * Podaje skanerowi tekst wpisany przez użytkownika i w pętli wywołuje czytanie kolejnego tokenu
     * Wypisuje do konsoli otrzymaną listę tokenów
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String odp;
        dwhSkaner skaner=new dwhSkaner();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Test skanera");
        System.out.println("Wpisz napis");
        odp=sc.nextLine();
      
        skaner.ustawInput(odp);
        while(skaner.czytajDalej()!=null);
        skaner.wyswietlWynik();

    }
    
}
