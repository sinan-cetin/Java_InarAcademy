import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c:");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = Math.pow(b , 2) - (4 * a * c );
		
		
		
		if(discriminant > 0) {
			System.out.print("The equation has two roots.");
			double root1 =(-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 =(-b - Math.sqrt(discriminant)) / ( 2* a);
			System.out.println(" " + root1 + " and " + root2);
		}
		else if(discriminant == 0) {
			System.out.print("The equation has one root.");
			double root1 =(-b + Math.sqrt(discriminant)) / (2* a);
			System.out.println(" " + root1);
		}
	
		else
			System.out.println("The equation has no reel root.");
	
			

	}

}

