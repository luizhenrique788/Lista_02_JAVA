package lista02;

import java.util.Scanner;

public class EquacaoQuantica {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Calculando o delta
        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Isso não é uma equação do segundo grau (a deve ser diferente de 0).");
        } else if (delta > 0) {
            // Duas raízes reais e diferentes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Uma raiz real
            double x = -b / (2 * a);
            System.out.println("Uma raiz real:");
            System.out.println("x = " + x);
        } else {
            // Raízes complexas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-delta) / (2 * a);
            System.out.println("Duas raízes complexas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }

        scanner.close();
    }
}
