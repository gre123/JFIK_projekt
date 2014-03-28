/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwhSkaner;

import java.util.LinkedList;

/**
 * Klasa implementująca skaner
 * 
 */
public class dwhSkaner {
    String input; //napis z wejścia
    int apozX; //aktualna pozycja w napisie wejściowym 
    dwhZn znaki=new dwhZn();  // obiekt zawierający tablice znaków
    LinkedList<dwhToken> wynik; // tablica wynikowa z tokenami
   // int apozY;
    
    public dwhSkaner()
    {
        input="";
        apozX=0;
        wynik=new LinkedList<dwhToken>();
        //apozY=0;
    }
    public dwhSkaner(String in)
    {
        input=in;
        apozX=0;
        wynik=new LinkedList<dwhToken>();
        //apozY=0;
    }
    public int dajPozX()
    {
        return apozX;
    }
    /**
     * Metoda zczytująca z napisu wejściowego kolejny token i wpisująca go na listę
     * @return stworzony token lub null, gdy koniec napisu
     */
    public dwhToken czytajDalej()
    {
        int i=0;
        boolean czy=false;
        dwhToken pom=new dwhToken();  //budowanie obiektu z tablicą znaków
          
        if(apozX>=input.length()) return null;  //sprawdzanie czy już napis się skończył
        while(i<znaki.tab.length && input.charAt(apozX)!=znaki.tab[i]) i++; //sprawdzanie czy dany znak jest w tablicy znaków
        if(i<znaki.tab.length) //jeśli dany znak jest w tablicy znaków
        {
            while(apozX<input.length() && input.charAt(apozX)==znaki.tab[i])  // to dla tego i każdego takiego samego znaku po nim
            {
             if(pom.typTokenu==typ.zaden) pom.typTokenu=typ.znacznik;  //ustaw typ tokenu jeśli nieustawiony
             pom.zawartosc=pom.zawartosc+input.charAt(apozX);  // dodaj ten znak do zawartosci tokenu
             apozX++;
            }
        }
        else 
        {
            if(input.charAt(apozX)=='<') //jeśli dziubek 
            {
                if(pom.typTokenu==typ.zaden) pom.typTokenu=typ.znacznik;
                pom.zawartosc=pom.zawartosc+input.charAt(apozX);
                apozX++;
            }
            while (czyLitera())  //dla wszystkich znaków a-zA-Z
             { 
                czy=true;
                if(pom.typTokenu==typ.zaden) pom.typTokenu=typ.slowo;  //ustaw typ tokenu na słowo, jeśli jest nieustawiony, moze to juz być znacznik
                pom.zawartosc=pom.zawartosc+input.charAt(apozX); // dodaj znak do zawartosci
                apozX++;
            }
      
        }
        
        if(apozX<input.length() && input.charAt(apozX)=='>') //jeśli dziubek 
        {
                if(pom.typTokenu==typ.zaden) pom.typTokenu=typ.znacznik;
                pom.zawartosc=pom.zawartosc+input.charAt(apozX);
                apozX++;
        }
        
        wynik.add(pom); //dodaj tokenik do listy
        return pom; //zwróć tokenik
    }
    /**
     * ustawia napis na wejśie skanera
     * @param in napis na wejscie 
     */
    public void ustawInput(String in)
    {
        input=in;
    }
    /**
     * wyswietla liste tokenów w konsoli
     */
    public void wyswietlWynik()
    {
        System.out.println();
        for(int i=0;i<wynik.size();i++)
        {
            System.out.println(wynik.get(i).typTokenu+":"+wynik.get(i).zawartosc);
        }
    }
    /**
     * sprawdza czy znak aktualny jest literą
     * @return 
     */
    public boolean czyLitera()
    {
      return apozX<input.length() && ((input.charAt(apozX)>='a' && input.charAt(apozX)<='z') ||( input.charAt(apozX)>='A' && input.charAt(apozX)<='Z'));  //dla wszystkich znaków a-zA-Z
    }
}
