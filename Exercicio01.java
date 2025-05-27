package lista02;

import java.util.Scanner;

public class Exercicio01 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Digite sua primeira nota: ");
int nota01 = sc.nextInt();
System.out.println("Digite o peso da sua primeira nota: ");
int peso01 = sc.nextInt();
System.out.println("Digite sua segunda nota: ");
int nota02 = sc.nextInt();
System.out.println("Digite o peso da sua segunda nota: ");
int peso02 = sc.nextInt();
System.out.println("Digite sua terceira nota: ");
int nota03 = sc.nextInt();
System.out.println("Digite o peso da sua terceira nota: ");
int peso03 = sc.nextInt();

float notaPonderada1 = nota01*peso01;
float notaPonderada2 = nota02*peso02;
float notaPonderada3 = nota03*peso03;
float somaNotasPonderadas = notaPonderada1 + notaPonderada2 + notaPonderada3;
float somaPesos = peso01 + peso02 + peso03;
float resultado = somaNotasPonderadas / somaPesos;
System.out.println("O valor antecessor é: " + resultado);
}

}