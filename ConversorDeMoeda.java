package lista02;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor em reais para a conversão: ");
		float real = sc.nextFloat();
		double resultadoDolar = real * 5.86;
		double resultadoEuro = real * 6.65;
		double resultadoLibra = real * 7.72;
		System.out.println(" O valor em dolar é: "+resultadoDolar+" O valor em Euro: "+resultadoEuro+" O valor em Libra é: "+resultadoLibra);
		sc.close();
		
	}

}
