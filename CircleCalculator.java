import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for radius input
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        // Display results with formatted output
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Close the scanner to free resources
        input.close();
    }
}

