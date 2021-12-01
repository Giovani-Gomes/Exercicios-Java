package com.company;

import java.util.Scanner;

public class Farenheit_Celsius {

    public static void main(String[] args) {
        double Farenheit ;
        double Celsius;
        System.out.println("Informe a Temperatura em Farenheit :");
        Scanner FARENHEIT = new Scanner(System.in);
        Farenheit = FARENHEIT.nextDouble();

        Celsius = (5*(Farenheit - 32)/9);

        System.out.println("A temperatura em Celsius: " + Celsius);
    }
}
