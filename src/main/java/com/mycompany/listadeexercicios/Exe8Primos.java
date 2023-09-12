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
public class Exe8Primos {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
    
        int num1, resultado;
        
        System.out.println("Informe um numero:");
        
        num1 = entrada.nextInt();
    
        resultado = num1 / num1;
        
        if (resultado == 1){
            
            System.out.println("PRIMO");
        }else if(num1 != 1){
        
        System.out.println("NAO É PRIMO");
        }
    }
}
