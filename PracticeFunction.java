
import java.util.*;

public class PracticeFunction {

    // question no 1 Enter 3 numbers from the user & make a function to print their average.
    // public static void calculateAverage(int num1, int num2, int num3) {
    //     int average = (num1 + num2 + num3) / 3;
    //     System.out.println("Average of 3 numbers :" + average);
    // }
    // question no 2 Write a function to print the sum of all odd numbers from 1 to n.
    // public static void printOddNumbers(int n) {
    //     int oddNumbers = 0;
    //     for (int i = 1; i <= n; i += 2) {
    //         oddNumbers += i;
    //     }
    //     System.out.println("sum of odd numbers " + oddNumbers);
    // }
    // Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void calculateCircumference(double radius) {
        double circumference = 2 * (3.14) * radius;
        System.err.println("circumference of circle is :" + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        // calculateAverage(num1, num2, num3);
        // int n = sc.nextInt();
        // printOddNumbers(n);
        double radius = sc.nextDouble();
        calculateCircumference(radius);
    }
}
