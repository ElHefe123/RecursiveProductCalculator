import java.util.Scanner;

public class RecursiveProductCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double product = calculateProduct(numbers, 0);
        System.out.println("The product of the five numbers is: " + product);
    }

    public static double calculateProduct(double[] numbers, int index) {
        if (index == numbers.length) {
            return 1.0; // Base case: When the index reaches the length of the array, return 1.
        } else {
            return numbers[index] * calculateProduct(numbers, index + 1); // Recursive step
        }
    }
}
