import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        float altura;
        int Sexo;
        float Peso;
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("Informe sua Altura: ");
       
        System.out.println("---------------------------------------");

        altura = scan.nextFloat();

        System.out.println("---------------------------------------");
        System.out.println("1 - Para Homem ");
        System.out.println("2 - Para Mulher");
        System.out.println("---------------------------------------");
        Sexo = scan.nextInt();

        if (Sexo == 1) {
            Peso = (float) ((72.7 * altura) - 58);
            System.out.println("Seu Peso Ideal é " + Peso);
        }else if (Sexo == 2) {
            Peso = (float) ((62.1*altura) - 44.7);
            System.out.println("Seu Peso Ideal é " + Peso);
        }
        else {
            System.out.println("Sexo não Definido.");
        }


    }
}
