/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios;

import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class Exe1SomaDeDoisNum {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.println("Informe o primeiro numero:");
        
        num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo numero:");
        
        num2 = entrada.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("O resultado da soma entre " + num1 + " e " + num2 + " é " + resultado );
        
        
        
    }
    
}
