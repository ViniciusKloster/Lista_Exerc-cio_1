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
public class Exe17CalculoIMC {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        
        
        float peso, altura, resultado;
        
        System.out.println("Informe seu peso: ");
        
        peso = entrada.nextInt();
        
        System.out.println("Informe sua altura: ");
        
        altura = entrada.nextFloat();
        
        altura = altura * altura;
        
        resultado = peso / altura;
        
        System.out.println("Seu IMC é: " + resultado);
        
        
    }
    
}
