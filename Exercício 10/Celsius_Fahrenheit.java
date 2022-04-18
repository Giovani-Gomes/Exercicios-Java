package com.company;

import java.util.Scanner;

public class Celsius_Fahrenheit{

    public static void main(String[] args) {
        double Farenheit ;
        double Celsius;
        Scanner scan= new Scanner(System.in);
        System.out.println("Informe a Temperatura em Celsius:");
        
        Celsius = scan.nextDouble();

        Farenheit= (Celsius * 9/5) + 32 ;

        System.out.println("A temperatura em Farenheit : " + Farenheit);
    }
}
