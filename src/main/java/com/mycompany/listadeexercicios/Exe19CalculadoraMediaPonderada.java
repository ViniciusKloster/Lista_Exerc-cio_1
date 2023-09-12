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
public class Exe19CalculadoraMediaPonderada {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, peso1, peso2, resultado;
        
        System.out.println("Informe o primeiro valor:");
        
        num1 = entrada.nextInt();
        
        System.out.println("Informe o primeiro peso:");
        
        peso1 = entrada.nextInt();
        
        System.out.println("Informe o segundo valor:");
        
        num2 = entrada.nextInt();
        
        System.out.println("Informe o segundo peso:");
        
        peso2 = entrada.nextInt();
        
        num1 = num1 * peso1;
        
        num2 = num2 * peso2;
        
        num1 = num1 + num2;
        
        peso1 = peso1 + peso2;
        
        resultado = num1 / peso1;
        
        System.out.println("O reultado é: " + resultado);
       
    }
    
}
