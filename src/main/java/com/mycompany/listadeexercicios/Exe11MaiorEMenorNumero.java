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
public class Exe11MaiorEMenorNumero {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Informe um numero:");
        num1 = entrada.nextInt();
        
        System.out.println("Informe um segundo numero:");
        num2 = entrada.nextInt();
        
        if (num1 > num2){
           System.out.println(num1 + " é maior que " + num2);
        }else{
            System.out.println(num2 + " é maior que " + num1);
        }
        
        
       
       
    
        
        
        
        
    }
    
}
