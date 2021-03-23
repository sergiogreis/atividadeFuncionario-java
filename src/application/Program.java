package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Enter the name of employee: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Enter the salary of employee: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Enter the amoount to be discounted: ");
		funcionario.tax = sc.nextDouble();		
				
		System.out.println(funcionario.name);
		System.out.println(funcionario.LiquidSalary());
		
		System.out.println("Enter the percent tax to be discounted: ");
		double percent = sc.nextDouble();
		funcionario.IncreaseSalary(percent);
		
		System.out.println("Updated data: " + funcionario.toString());
		sc.close();
		
	}

}
