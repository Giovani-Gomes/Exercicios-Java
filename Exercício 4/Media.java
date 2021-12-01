package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int Nota1,Nota2,Nota3,Nota4;
       int media;

        System.out.println("Digite Primeira Nota: ");
        Scanner NUM = new Scanner(System.in);
        Nota1 = NUM.nextInt();

        System.out.println("Digite Segunda Nota: ");
        Scanner NUM1 = new Scanner(System.in);
        Nota2 = NUM1.nextInt();

        System.out.println("Digite Terceira Nota: ");
        Scanner NUM2 = new Scanner(System.in);
        Nota3 = NUM2.nextInt();
        
        System.out.println("Digite Quarta Nota: ");
        Scanner NUM3 = new Scanner(System.in);
        Nota4 = NUM3.nextInt();

        media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;

        System.out.println("A Média é " + media);

    }
}
