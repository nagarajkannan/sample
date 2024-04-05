public class Factorial {
    // Function to calculate factorial of a number
    public static int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number1 = 5; // First number
        int number2 = 7; // Second number

        int factorial1 = calculateFactorial(number1);
        int factorial2 = calculateFactorial(number2);

        System.out.println("Factorial of " + number1 + " is: " + factorial1);
        System.out.println("Factorial of " + number2 + " is: " + factorial2);
    }
}
