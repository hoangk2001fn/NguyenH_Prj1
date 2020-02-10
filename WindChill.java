
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		double temperature, windSpeed, windChillTemp;
		final String programmerName = "Hoang Nguyen";
		System.out.println("Wind Chill Temperature Calculator");
		System.out.print("Please enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
        Scanner userInput1 = new Scanner(System.in);
        temperature = userInput1.nextDouble();
        System.out.print("Please enter the wind sped (must be >= 5 and <= 60): ");
        Scanner userInput2 = new Scanner(System.in);
        windSpeed = userInput2.nextDouble();
        windChillTemp = 35.74 + 0.6215*temperature - 35.75*Math.pow(windSpeed, 0.16) + 0.4275*temperature*Math.pow(windSpeed, 0.16);
        System.out.println("Wind chill temperature: " + windChillTemp + " degrees Fahrenheit");
        System.out.println("Programmer: " + programmerName);
        System.exit(0);
	}
}
