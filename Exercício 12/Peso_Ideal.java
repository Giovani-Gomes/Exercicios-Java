package com.company;

import java.util.Scanner;

public class Peso_ideal {

    public static void main(String[] args) {
        double altura = 0;
        float Peso;
        System.out.println("Digite sua Altura :");
        Scanner ALTURA = new Scanner(System.in);
        altura = ALTURA.nextDouble();

        Peso = (float) ((72.7 * altura) - 58);

        System.out.println("Seu Peso idela é : " + Peso);

    }
}
