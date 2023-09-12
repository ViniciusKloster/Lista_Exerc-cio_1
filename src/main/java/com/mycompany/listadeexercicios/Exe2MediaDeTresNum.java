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
public class Exe2MediaDeTresNum {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, num3, resultado1, resultado2;
        
        System.out.println("Informe o primeiro numero:");
        
        num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo numero:");
        
        num2 = entrada.nextInt();
        
        System.out.println("Informe o terceiro numero:");
        
        num3 = entrada.nextInt();
        
        resultado1 = num1 + num2 + num3;
        
        System.out.println("O resultado da soma é: " + resultado1);
        
        resultado2 = resultado1 / 3;
        
        System.out.println("O resultado da aritmédica entre: "+ num1 + " " + num2 + " " + num3 + " é: " + resultado2);
    }
    
}
