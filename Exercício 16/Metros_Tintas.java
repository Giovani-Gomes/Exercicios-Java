package com.company;

import java.util.Scanner;

public class Metros_Tintas{

    public static void main(String[] args) {
        double Area_Quadrada;
        double Litros;
        double Preço_Lata = 80.0;
        int Capacidade = 18;
        int Total, Latas;



        System.out.print(("Informe a Área Quadrada em que pretende Pintar: "));
        Scanner AREA = new Scanner(System.in);
        Area_Quadrada = AREA.nextDouble();
        Litros = Area_Quadrada / 3;

        Latas = (int) (Litros / Capacidade);
        Total = (int) (Latas * Preço_Lata);

        System.out.println("Você Usará " + Latas + " de Tintas.");
        System.out.println("O Preço total é R$" + Total);



    }
}
