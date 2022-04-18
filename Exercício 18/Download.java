package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       float Tam_Arquivo,Velo_Link, Temp_Aproximado;
       Scanner scan = new Scanner(System.in);
        System.out.print("Informe o Tamanho do Arquivo(MegaBytes) :");
        Tam_Arquivo = scan.nextFloat();

        System.out.print("Informe a velocidade do link em Mbps: ");
         Velo_Link = scan.nextFloat();
        DecimalFormat d = new DecimalFormat(".##", new DecimalFormatSymbols(new Locale("en", "US")));

        Temp_Aproximado = ((Tam_Arquivo * 8) / Velo_Link) / 60;
        System.out.println("O tempo aproximado de download é de " + d.format(Temp_Aproximado) + " minutos");

    }
}
