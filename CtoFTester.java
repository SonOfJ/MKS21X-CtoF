import java.util.Scanner;

public class CtoFTester{
    public static void main(String[] args){
	double temperature;
	Scanner scan = new Scanner(System.in);
	System.out.println("Press 1 if the temperature is in Celsius.");
	System.out.println("Press 2 if the temperature is in Fahrenheit.");
	int choice = scan.nextInt();
	
	if (choice == 1) {
		System.out.println("Enter temperature.");
		temperature = scan.nextDouble();
		System.out.println(temperature * 1.8 + 32);
	}

	if (choice == 2) {
		System.out.println("Enter temperature.");
		temperature = scan.nextDouble();
		System.out.println((temperature - 32) / 1.8);
	}

	else
		System.out.println ("Invalid input.");
    }
}