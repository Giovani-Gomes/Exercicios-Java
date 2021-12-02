package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base,altura;
        int Area, dobro;
        System.out.println("Informe as Medidas do Quadrado - Altura");
        Scanner ALTURA = new Scanner(System.in);
        altura = ALTURA.nextInt();

        System.out.println("Informe as Medidas do Quadrado - Largura");
        Scanner BASE = new Scanner(System.in);
        base = BASE.nextInt();

        Area = base * altura;

        System.out.println("Área do Quadrado é " + Area);

        dobro = Area*2;
        System.out.println("O dobro da Área do Quadrado é " + dobro);
    }
}
