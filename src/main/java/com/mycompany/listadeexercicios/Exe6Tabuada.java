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
public class Exe6Tabuada {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        int numTabuada, cont = 1, resultado;
        
        boolean continuar = true;
        
        String opcaoescolha;
        
        while(continuar){
            System.out.println("Escolha uma tabuada");

            numTabuada = entrada.nextInt();
        
        while(cont <= 10){

                resultado = numTabuada * cont;

                System.out.println(numTabuada + " x " + cont + " = " + resultado);
                cont = cont + 1;
            }
            
            cont = 1;
            
            System.out.println("|--------------------------------|");
            System.out.println("|    Deseja continuar? (s/n)     |");
            System.out.println("|--------------------------------|");

            opcaoescolha = entrada.next();

            if (opcaoescolha.equals("s")){
                continuar = true;
            }else{
                continuar = false; 
            }
        }
    }
           
        
 }
