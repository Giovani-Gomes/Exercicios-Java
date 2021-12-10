package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double Area_Quadrada;
        double Consumo_Litros;
        float Quantidade_Latas_18;
        float Quantidade_Latas_36;
        float valor_total_18;
        float valor_total_36;
        float Quantidade_Latas_Mistas_18;
        float Quantidade_Latas_Mistas_36;
        float Quantidade_Latas_Mistas_Total;
        float Quantidade_Litros_18;
        float Resto_18;
        float Valor_misto_18;
        float Valor_misto_36;
        float Valor_misto_total;
        
        System.out.print("Informe em Metros Quadrados(m²) a Área que será pintada: ");
        Scanner Area= new Scanner(System.in);
        Area_Quadrada = Area.nextInt();
        Consumo_Litros = Area_Quadrada / 6;
        System.out.println("O consumo de tinta é"+ Consumo_Litros + " LITROS");
        Quantidade_Latas_18 = (float) (Consumo_Litros / 18);
        Quantidade_Latas_36 = (float) (Consumo_Litros/ 3.6);
        System.out.println("A quantidade de Galôes de 18 LITROS a ser usado é: " + Quantidade_Latas_18);
        System.out.println("a quantidade de Galôes de 3,6 LITROS a ser usado é:" + Quantidade_Latas_36);
        valor_total_18 = Quantidade_Latas_18 * 80;
        valor_total_36 = Quantidade_Latas_36 * 25;
        System.out.println("O valor total em GALOES de 18 LITROS é: " + valor_total_18 );
        System.out.println("O valor total em GALOES de 3,6 LITROS é: " + valor_total_36);

        Quantidade_Latas_Mistas_18 = (float) (((Consumo_Litros * 0.10) + Consumo_Litros) / 18);
        Quantidade_Litros_18 = Quantidade_Latas_Mistas_18 * 18;
        Resto_18 = (float) (((Consumo_Litros * 0.10) + Consumo_Litros) - Quantidade_Litros_18);
        Quantidade_Latas_Mistas_36 = (float) (Resto_18 / 3.6);
        Quantidade_Latas_Mistas_Total = Quantidade_Latas_Mistas_18 + Quantidade_Latas_Mistas_36;
        Valor_misto_18 = (float) (Quantidade_Latas_Mistas_18 * 0.80);
        Valor_misto_36 = Quantidade_Latas_Mistas_36 * 25;
        Valor_misto_total = Valor_misto_18 + Valor_misto_36;

        System.out.println("A quantidade de latas de 18 litros: " + Quantidade_Latas_Mistas_18);
        System.out.println("A quantidade de latas de 3,6 litros: " + Quantidade_Latas_Mistas_36);
        System.out.println("A quantidade de latas Mistas: " + Quantidade_Latas_Mistas_Total);
        System.out.println("A o valor total considerando GALOES e LATAS é (acresentando 10% de quebra): R$" + Valor_misto_total);

    }
}
