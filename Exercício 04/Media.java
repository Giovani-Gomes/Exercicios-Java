package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Nota1,Nota2,Nota3,Nota4;
        int media;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite Primeira Nota: ");
        Nota1 = scan.nextInt();

        System.out.print("Digite Segunda Nota: ");
        Nota2 =scan.nextInt();

        System.out.print("Digite Terceira Nota: ");
        Nota3 = scan.nextInt();

        System.out.print("Digite Quarta Nota: ");
        Nota4 = scan.nextInt();

        media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;

        System.out.print("A Média é " + media);

    }
}
