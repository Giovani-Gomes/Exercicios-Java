    package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      float Metros,Centimentros;

    System.out.println("Digite a medida em Metros :");
    Scanner METROS = new Scanner(System.in);
    Metros = METROS.nextFloat();

    Centimentros = Metros * 100;
    
    System.out.printf("%.1f cm",Centimentros);
    }
}
