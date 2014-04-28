/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwh;
import java.io.File;

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
             
    public static void generujzPlika(String s)
    {
        File plik = new File(s);
        jflex.Main.generate(plik);
    }
    public static void main(String[] args) {
   
        String siema = "C:/Users/Grzesiek/Documents/NetBeansProjects/DWH/src/dwh/dwhGrammar.flex";
        generujzPlika(siema);

    }
    
}
