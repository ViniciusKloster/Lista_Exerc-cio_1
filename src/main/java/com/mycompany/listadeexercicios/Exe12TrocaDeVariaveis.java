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
public class Exe12TrocaDeVariaveis {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        int num1 = 10, num2 =15, temp;
        
        temp = num1;
        
        num1 = num2;
        
        num2 = temp;
        
        
        
        System.out.println(num1 + " " + num2);
    }
    
}
