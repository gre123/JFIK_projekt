/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwhSkaner;


enum typ{
    slowo,formatowany,znacznik,zaden,blad
}
/**
 * klasa odpowiedzialna za sam token
 * 
 */
public class dwhToken {
    typ typTokenu=typ.zaden;
    String zawartosc="";
    int pozX=0;
    int pozY=0;
}
