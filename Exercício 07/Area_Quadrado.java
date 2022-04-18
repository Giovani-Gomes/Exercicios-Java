package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base,altura;
        int Area, dobro;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe as Medidas do Quadrado - Altura");
        altura = scan.nextInt();

        System.out.println("Informe as Medidas do Quadrado - Largura");
        base = scan.nextInt();

        Area = base * altura;

        System.out.println("Área do Quadrado é " + Area);

        dobro = Area*2;
        System.out.println("O dobro da Área do Quadrado é " + dobro);
    }
}
