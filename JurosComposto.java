package lista02;

import java.util.Scanner;

public class JurosComposto {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
	System.out.println("Calculadora de Juros compostos. ");
	System.out.println("Digite qual é o valor inicial: ");
	float capital = sc.nextFloat();
	System.out.println("Digite o valor da taxa por periodo: ");
	float taxa = sc.nextFloat();
	System.out.println("Digite por quantos meses você pretende aplicar o valor: ");
	float meses = sc.nextFloat();
	float taxaetapa = 1+ (taxa / 100);
	float periodo = (float) Math.pow(taxa, meses);
	float montante = capital*periodo;
	System.out.println("O montante final é: "+ montante + ".");
	sc.close();
	}

}
