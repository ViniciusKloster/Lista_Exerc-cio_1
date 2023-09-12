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
public class Exe10Temperatura {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        double num1, num2, resultado;
        
        System.out.println("Informe a temperatura:");
        
        num1 = entrada.nextDouble();
        
        num2 = num1 * 1.8;
        
        resultado = num2 + 32;
        
        System.out.println(num1 + "° celsius são " + resultado + "° fahrenheit");
    }
    
}
