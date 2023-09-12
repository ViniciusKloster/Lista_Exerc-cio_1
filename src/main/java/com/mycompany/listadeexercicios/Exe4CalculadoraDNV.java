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
public class Exe4CalculadoraDNV {
    public static void main(String args[]){
        
        
        Scanner entrada = new Scanner(System.in);
        
        
        int opcao;
        
        float num1, num2, resultado = 0;
        
        boolean continuar = true;
        
        String opcaoescolha;
        
        while(continuar){
            
            System.out.println("--------------------------------");
            System.out.println("Calculadora das quatro operações");
            System.out.println("--------------------------------");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("--------------------------------");

            
            opcao = entrada.nextInt();


            
            if(opcao == 1){//Soma
                  
               System.out.println("Informe o primeiro numero");
               num1 = entrada.nextFloat();

            
               System.out.println("Informe o segundo numero");
               num2 = entrada.nextFloat();
                resultado = num1 + num2;
           }else if(opcao == 2){
               
               System.out.println("Informe o primeiro numero");
               num1 = entrada.nextFloat();

            
               System.out.println("Informe o segundo numero");
               num2 = entrada.nextFloat();
               resultado = num1 - num2;
           }else if(opcao == 3){
               
               System.out.println("Informe o primeiro numero");
               num1 = entrada.nextFloat();

            
               System.out.println("Informe o segundo numero");
               num2 = entrada.nextFloat();
               resultado = num1 * num2;
           }else if(opcao == 4){
               
               System.out.println("Informe o primeiro numero");
               num1 = entrada.nextFloat();

            
               System.out.println("Informe o segundo numero");
               num2 = entrada.nextFloat();
               resultado = num1 / num2;
           }else{
               System.out.println("Opção inesistente");
           }

            System.out.println("--------------------------------");
            System.out.println("RESULTADO");
            System.out.println("--------------------------------");
            System.out.println(resultado);
        
            System.out.println("--------------------------------");
            System.out.println("Deseja continuar? (s/n)");
            System.out.println("--------------------------------");
            opcaoescolha = entrada.next();
            
            if (opcaoescolha.equals("s")){
                continuar = true;
            }else{
                continuar = false; 
                System.out.println("---------------------------------------");
                System.out.println("Obrigado por usar minha calcularora! =)");
                System.out.println("---------------------------------------");
               
               
                
            }
        }        
    }
}
