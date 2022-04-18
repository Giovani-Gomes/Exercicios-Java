package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double Farenheit ;
        double Celsius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a Temperatura em Farenheit :");
        
        Farenheit = scan.nextDouble();

        Celsius = (5*(Farenheit - 32)/9);

        System.out.println("A temperatura em Celsius: " + Celsius);
    }
}
