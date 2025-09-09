
import java.util.*;

public class ArraysProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // find the total count and index of key in an array ?
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int count = 0;
        System.out.println("Enter the elements  of array");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the key of array");
        int key = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (key == numbers[i]) {
                count++;
                System.out.print("At index : " + i + "\n");
            }
        }
        if (count == 0) {
            System.out.println(key + " Not Found.");
        }
        System.out.println("Total count is :" + count);

    }
}
