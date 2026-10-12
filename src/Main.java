import java.util.Scanner;

class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        } while (!done);

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
