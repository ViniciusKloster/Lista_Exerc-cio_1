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
public class Exe7Fatorial {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int num1, cont = 2, resultado;
        
           System.out.println("Informe o número:");
        
           num1 = entrada.nextInt();
        cont = num1;
        while(cont > 2){
             
            cont = cont - 1;
        
            resultado = num1 * cont;
            
            num1 = num1 * cont;
            
            System.out.println(resultado);
        } 
    }
}
