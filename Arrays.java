
import java.util.*;

public class Arrays {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Q no 1 take the size and elements of arrays and print them 
        // System.err.println("Enter the size of array :");
        // int size = sc.nextInt();
        // int[] marks = new int[size];
        // System.err.println("Enter the elements of array :");
        // for (int i = 0; i < size; i++) {
        //     marks[i] = sc.nextInt();
        // }
        // for (int j = 0; j < size; j++) {
        //     System.err.print(marks[j] + " ");
        // }

        int marks[] = new int[5];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the value to search in array:");
        int value = sc.nextInt();
        for (int j = 0; j < 5; j++) {
            if (value == marks[j]) {
                System.out.print(value + " is  at index : " + marks[j]);

            }

        }

    }
}
