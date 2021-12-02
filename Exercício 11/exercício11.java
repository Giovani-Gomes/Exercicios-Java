package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2; // Dois números inteiros
        float num3; // Número real;

        System.out.println("Informe o Primeiro Número inteiro : ");
        Scanner NUM1 = new Scanner(System.in);
        num1 = NUM1.nextInt();

        System.out.println("Informe o Segundo Número inteiro : ");
        Scanner NUM2 = new Scanner(System.in);
        num2 = NUM2.nextInt();

        System.out.println("Informe um Número Real : ");
        Scanner NUM3 = new Scanner(System.in);
        num3 = NUM2.nextFloat();

       num1 = num1 * 2 * (num2 / 2);
       num2 = (int) (num1 *  3 + num3);
       num3 = (float) Math.pow(num3,2);

        System.out.println("O produto do dobro do primeiro com metade do segundo = " + num1);
        System.out.println("A soma do triplo do primeiro com o terceiro. = " + num2);
        System.out.println("O terceiro elevado ao cubo. =  " + num3);

    }
}
