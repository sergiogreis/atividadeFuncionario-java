package entities;

public class Funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double LiquidSalary() {
		return grossSalary - tax;
	}
	
	
	public void IncreaseSalary(double percent) {
		this.grossSalary += grossSalary * percent /100.00;
		
	}
	
	public String toString() {
		return name + ", R$: " + LiquidSalary();
			
	}	
}
