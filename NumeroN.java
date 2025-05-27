package lista02;

import java.util.Scanner;

public class NumeroN 
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Média Aritmética.");
        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = sc.nextInt();

        double soma = 0;

        for (int numero = 1; numero <= quantidade; numero++) {
            System.out.print("Digite o " + numero + "º número: ");
            double numero2 = sc.nextDouble();
            soma += numero2;
        }

        double media = soma / quantidade;
        System.out.printf("A média aritmética é: %.2f%n", media);

        sc.close();
    }
}

