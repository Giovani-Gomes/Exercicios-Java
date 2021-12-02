package com.company;

import java.util.Scanner;

public class Calculo_Salario {

    public static void main(String[] args) {
        double sal_hora;
        int horas_trabalhadas;
        double Salario;
        System.out.println("Informe quanto ganha por hora: ");
        Scanner SAL_HORA = new Scanner(System.in);
        sal_hora = SAL_HORA.nextDouble();

        System.out.println("Informe suas horas trabalhadas este Mês : ");
        Scanner HORAS_TRABALHADAS = new Scanner(System.in);
        horas_trabalhadas = HORAS_TRABALHADAS.nextInt();

        Salario =(sal_hora * horas_trabalhadas);

        System.out.println("Seu Salário este Mês é R$ " + Salario);
    }
}
