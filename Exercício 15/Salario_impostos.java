package com.company;

import java.util.Scanner;

public class Salario_impostos{

    public static void main(String[] args) {
        int Horas_trabalhadas;
        float Valor_hora,Salario_Bruto,Valor_Imposto_Renda , Valor_INSS,Valor_Sindicado ,Salario_liquido,Descontos;

        System.out.println("Informe quanto ganha por hora: ");
        Scanner VALOR_HORAS = new Scanner(System.in);
        Valor_hora = VALOR_HORAS.nextFloat();

        System.out.println("Informe quantas horas você trabalhou:  ");
        Scanner HORAS_TRABALHADAS = new Scanner(System.in);
        Horas_trabalhadas = HORAS_TRABALHADAS.nextInt();

        Salario_Bruto = Horas_trabalhadas * Valor_hora;
        Valor_Imposto_Renda = (float) (0.11 * Salario_Bruto);
        Valor_INSS = (float) (0.08 * Salario_Bruto);
        Valor_Sindicado = (float) (0.05 * Salario_Bruto);
        Descontos = Valor_INSS + Valor_Imposto_Renda + Valor_Sindicado;
        Salario_liquido = Salario_Bruto - Descontos;

        System.out.println("Salário Bruto :R$"+Salario_Bruto);
        System.out.println("Imposto de Renda: " + Valor_Imposto_Renda);
        System.out.println("INSS : " + Valor_INSS);
        System.out.println("Sindicato : " + Valor_Sindicado);
        System.out.println("Salário Liquido "+ Salario_liquido );


    }
}
