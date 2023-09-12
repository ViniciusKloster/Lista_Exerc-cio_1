/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios;

import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class Exe18Calendario {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int jan = 31,
            fev = 29,    
            mar = 31, 
            abr = 30,
            mai = 31,
            jun = 30,
            jul = 31,
            ago = 31,
            set = 30,
            out = 31,
            nov = 30,
            dez = 31;
        
        int mes, ano;
        
        System.out.println("Informe o mês: ");
        
        mes = entrada.nextInt();
        
        System.out.println("Informe o ano: ");
        
        ano = entrada.nextInt();
        
        if (mes == 1){
            System.out.println("O mês de janeiro do ano " + ano + " tem " + jan + " dias");
        }else if(mes == 2){
            System.out.println("O mês de fevereiro do ano " + ano + " tem " + fev + " dias");
        }else if(mes == 3){
            System.out.println("O mês de março do ano " + ano + " tem " + mar + " dias");
        }else if(mes == 4){
            System.out.println("O mês de abril do ano " + ano + " tem " + abr + " dias");
        }else if(mes == 5){
            System.out.println("O mês de maio do ano " + ano + " tem " + mai + " dias");
        }else if(mes == 6){
            System.out.println("O mês de junho do ano " + ano + " tem " + jun + " dias");
        }else if(mes == 7){
            System.out.println("O mês de julho do ano " + ano + " tem " + jul + " dias");
        }else if(mes == 8){
            System.out.println("O mês de agosto do ano " + ano + " tem " + ago + " dias");
        }else if(mes == 9){
            System.out.println("O mês de setembro do ano " + ano + " tem " + set + " dias");
        }else if(mes == 10){
            System.out.println("O mês de outubro do ano " + ano + " tem " + out + " dias");
        }else if(mes == 11){
            System.out.println("O mês de novembro do ano " + ano + " tem " + nov + " dias");
        }else if(mes == 12){
            System.out.println("O mês de dezembro do ano " + ano + " tem " + dez + " dias");
        }
    } 
}
