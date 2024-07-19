package projects;

public class Triangle {

	public static void main(String[] args) {
		// Main rule is Sum of 3 angles should be equal to 180.
		// That should be called as Triangle.
		int A1 = 80;
		int A2 = 80;
		int A3 = 80;
		int Angle = A1+A2+A3;
		if (Angle==180) {
			System.out.println("The given Angles form a Triangle");
		}
		else
			System.out.println("The given Angles doesn't form a Triangle");

	}

}
