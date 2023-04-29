package entity;

public class Student {

	public String name;
	public double _1trimestre;
	public double _2trimestre;
	public double _3trimestre;
	
	public double finalGrade() {
		return _1trimestre + _2trimestre + _3trimestre;
	}
	
	public void aprovado() {
		if ( finalGrade() >= 60 ) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - finalGrade());
		}
	}
}
