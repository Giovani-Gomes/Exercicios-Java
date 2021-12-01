package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Raio;
        final double PI = 3.14;
        double Area;
        System.out.println("Informe a o Raio do Círculo: ");
        Scanner RAIO = new Scanner(System.in);
        Raio = RAIO.nextInt();
        Area = PI * (Raio*Raio);

        System.out.println("Área é " + Area);
    }
}
