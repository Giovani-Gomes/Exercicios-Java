package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int Num1;
        int Num2;
        int Soma;

        System.out.println("Digite um número: ");
        Scanner Numero1 = new Scanner(System.in);
        Num1 = Integer.parseInt(Numero1.next());

        System.out.println("Mais Digite um número: ");
        Scanner Numero2 = new Scanner(System.in);
        Num2= Integer.parseInt(Numero2.next());

        Soma = Num1 + Num2;

        System.out.println("A soma entre " + Num1 + " e " + Num2 + " = " + Soma);

    }
}
