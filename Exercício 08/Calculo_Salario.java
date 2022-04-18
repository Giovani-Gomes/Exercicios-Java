package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        double sal_hora;
        int horas_trabalhadas;
        double Salario;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quanto ganha por hora: ");
        
        sal_hora = scan.nextDouble();

        System.out.println("Informe suas horas trabalhadas este Mês : ");
        horas_trabalhadas = scan.nextInt();

        Salario =(sal_hora * horas_trabalhadas);

        System.out.println("Seu Salário este Mês é R$ " + Salario);
    }
}
