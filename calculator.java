import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Arthmetic operations here
        System.out.println("Arithmetic Operations as follows:");
        System.out.println("1. Addition (+), 2. Subtraction (-), 3. Multiplication (*), 4. Division (/)");
    
        // Select choice here
        System.out.print("Please select an operation (1/2/3/4): ");
        int choice = scanner.nextInt();
        //Add first number
        System.out.print("Enter the first number: ");
        double First = scanner.nextDouble();
        //Add Second number
        System.out.print("Enter the second number: ");
        double Second = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                //Addition of two numbers
                result = First + Second;
                System.out.println("Result: " + First + " + " + Second + " = " + result);
                break;
            case 2:
                //Substraction of two numbers
                result = First - Second;
                System.out.println("Result: " + First + " - " + Second + " = " + result);
                break;
            case 3:
                //Multiplication of two numbers
                result = First * Second;
                System.out.println("Result: " + First + " * " + Second + " = " + result);
                break;
            case 4:
                //Division of two numbers
                if (Second != 0) {
                    result = First / Second;
                    System.out.println("Result: " + First + " / " + Second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                //Display invalid choice here
                System.out.println("Error: Invalid choice.");
        }

        scanner.close();
    }
}
