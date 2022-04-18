package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int Numero;

        System.out.println("Digite seu Número: ");
        Scanner NUM = new Scanner(System.in);

        Numero = NUM.nextInt();

        System.out.println("O Número informado foi " + Numero);

    }
}
