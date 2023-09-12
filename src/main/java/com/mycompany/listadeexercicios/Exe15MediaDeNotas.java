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
public class Exe15MediaDeNotas {
    public static void main(String args []){
       
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, num3, resultado;
        
        System.out.println("Informe a nota do segundo semestre: ");
        
        num1 = entrada.nextInt();
        
        System.out.println("Informe a nota do segundo semestre: ");
        
        num2 = entrada.nextInt();
        
        System.out.println("Informe a nota do terceiro semestre: ");
        
        num3 = entrada.nextInt();
        
        resultado = num1 + num2 + num3;
        
        if (resultado >= 70){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }   
    
    
}
