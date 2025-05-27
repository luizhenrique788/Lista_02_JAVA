package lista02;

import java.util.Scanner;

public class AreaPerimetroTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite 3 valores para calcular a area e o perimetro do triangulo valor: ");
		 float numero01 = sc.nextFloat();
		 float numero02 = sc.nextFloat();
		 float numero03 = sc.nextFloat();
		 float resultado = numero01*numero02;
		 System.out.println("O area do triangulo é: "+ resultado/2);
		 System.out.println("O perimetro do triangulo é: "+ (numero01 + numero02 + numero03));
}

}
