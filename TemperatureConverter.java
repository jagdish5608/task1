import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Temperature Converter -----");
        System.out.println("1. Celsius to Fahrenheit & Kelvin");
        System.out.println("2. Fahrenheit to Celsius & Kelvin");
        System.out.println("3. Kelvin to Celsius & Fahrenheit");
        System.out.print("Enter your choice (1-3): ");

        int choice = sc.nextInt();
        double temp;

        switch(choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temp = sc.nextDouble();
                System.out.println("Fahrenheit: " + (temp * 9/5 + 32));
                System.out.println("Kelvin: " + (temp + 273.15));
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = sc.nextDouble();
                System.out.println("Celsius: " + ((temp - 32) * 5/9));
                System.out.println("Kelvin: " + (((temp - 32) * 5/9) + 273.15));
                break;

            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                temp = sc.nextDouble();
                System.out.println("Celsius: " + (temp - 273.15));
                System.out.println("Fahrenheit: " + ((temp - 273.15) * 9/5 + 32));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
