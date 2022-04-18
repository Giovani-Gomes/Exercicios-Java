package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int Num1;
        int Num2;
        int Soma;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");

        Num1 = scan.nextInt();

        System.out.println("Mais Digite um número: ");
        Num2= scan.nextInt();

        Soma = Num1 + Num2;

        System.out.println("A soma entre " + Num1 + " + " + Num2 + " = " + Soma);

    }
}
