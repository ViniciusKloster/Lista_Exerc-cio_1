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
public class Exe9Fibonacci {
    public static void main(String args[]){
        
        int num0 = 0, num1 = 1;
        System.out.println(num1);
        while(num0 <= 100){
            
            num0 = num0 + num1;
            System.out.println(num0);
            num1 = num1 + num0;
            System.out.println(num1);
            num0 = num0 + num1;
            System.out.println(num0);
            num1 = num1 + num0;
            System.out.println(num1);
         
            
        }
    }
}
