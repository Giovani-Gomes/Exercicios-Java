package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Raio;
        final double PI = 3.14;
        double Area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a o Raio do Círculo: ");
        Raio = scan.nextInt();
        Area = PI * (Raio*Raio);

        System.out.println("Área é " + Area);
    }
}
