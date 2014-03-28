/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwhSkaner;
/**
 * 
 * klasa z tablicą znaków
 */
public class dwhZn {
    char [] tab=new char[20];
    public dwhZn()
    {
       for(int i=0;i<20;i++)
       {
           tab[i]=' ';
       }
       tab[0]='*';
       tab[1]=' ';
       tab[2]='"';
       tab[3]='/';
       tab[4]='_';
       tab[5]='=';
       tab[6]='-';
       tab[7]='[';
       tab[8]=']';
       
    }
}
