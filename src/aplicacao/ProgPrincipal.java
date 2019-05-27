package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
		para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
		resolver este problema. 
		*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o Nome e as notas do Aluno");
		System.out.print("Nome: ");
		aluno.name = sc.nextLine();
		
		System.out.print("Nota 1� Trimestre: ");
		aluno.grade1 = sc.nextDouble();
		
		System.out.print("Nota 2� Trimestre: ");
		aluno.grade2 = sc.nextDouble();
		
		System.out.print("Nota 3� Trimestre: ");
		aluno.grade3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f pontos%n", aluno.gradeFinal());
		
		if (aluno.gradeFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltaram %.2f Pontos%n", aluno.pontosFaltantes());
		}
		else {
			System.out.println("Aprovado");
		}

	}
}
