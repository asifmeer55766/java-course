
import java.util.Scanner;

public class Function {

    // static void myMethod() {
    //     System.out.println("I just got executed!");
    // }
    // static void printName(String name) {
    //     System.out.println(name);
    // }
    // static int printSum(int x, int y) {
    //     return x + y;
    // }
    // function to find the factorial of number 
    public static int calculateFactorial(int n) {
        int factorial = 1;
        if (n == 1 || n < 1) {
            return 1;
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // myMethod();//call the function
        // printName("Asif");//pass a parameter
        // System.out.print(printSum(34, 44)); //print the return type
        int factorial = calculateFactorial(n);
        System.out.print("Factorial of number :" + factorial);

    }
}
