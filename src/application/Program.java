package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		System.out.println("Nome:");
		aluno.name = sc.nextLine();
		System.out.println("NOTA 1º TRIMESTRE:");
		aluno._1trimestre = sc.nextDouble();
		System.out.println("NOTA 2º TRIMESTRE:");
		aluno._2trimestre = sc.nextDouble();
		System.out.println("NOTA 3º TRIMESTRE:");
		aluno._3trimestre = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", aluno.finalGrade());
		aluno.aprovado();
		
		sc.close();
		
	}

}
