    package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    float Metros,Centimentros;
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a medida em Metros :");
    
    Metros = scan.nextFloat();

    Centimentros = Metros * 100;
    
    System.out.printf("%.1f cm",Centimentros);
    }
}
