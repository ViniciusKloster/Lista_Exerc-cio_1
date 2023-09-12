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
public class Exe3ParOuImpar {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int num1, resultado;
        
        System.out.println("Informe o numero:");
        
        num1 = entrada.nextInt();
        
        resultado = num1 % 2;
        
        if (resultado == 0){
            
            System.out.println("Resultado: PAR");
        }else if(num1 != 0){
        
        System.out.println("Resultado: IMPAR");
        
        
    }
 } 
}
    

