package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        double altura = 0;
        float Peso;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua Altura :");
        altura = scan.nextDouble();

        Peso = (float) ((72.7 * altura) - 58);

        System.out.println("Seu Peso idela é : " + Peso);

    }
}
