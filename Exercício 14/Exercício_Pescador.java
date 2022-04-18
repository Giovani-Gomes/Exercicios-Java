package com.company;

import java.util.Scanner;

public class Exercício_Pescador{

    public static void main(String[] args) {
        
        int Peso_Peixe;
        int Execesso_Peso;
        int Multa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o Peso dos Peixes : ");
        
        Peso_Peixe = scan.nextInt();
        Execesso_Peso = Peso_Peixe - 50;

        if (Execesso_Peso > 0){
            Multa =  Execesso_Peso * 4;
            System.out.println("Você informou o Peso : " + Peso_Peixe + " Quilos");
            System.out.println("Excesso " + Execesso_Peso + " Quilos");
            System.out.println("Valor da Multa :  R$" + Multa);
        }else{
            Multa = 0;
            Execesso_Peso = 0;
            System.out.println("Você informou o Peso : " + Peso_Peixe + " Quilos");
            System.out.println("Excesso " + Execesso_Peso + " Quilos");
            System.out.println("Valor da Multa : R$" + Multa);
        }


    }
}
