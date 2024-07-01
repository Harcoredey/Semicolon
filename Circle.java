import java.util.Scanner;
public class Circle {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius value: ");
		int radius = input.nextInt();

		System.out.print("Enter perimeter value: ");
		int perimeter = input.nextInt();

		int multiply = radius * perimeter;

		System.out.print (multiply);
  }

}