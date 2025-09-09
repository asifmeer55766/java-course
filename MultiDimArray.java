
import java.util.*;

public class MultiDimArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //multi dimentional array get data and show data 
        System.out.println("Enter the size of Row");
        int row = sc.nextInt();
        System.out.println("Enter the size of Column");
        int col = sc.nextInt();
        int[][] numbers = new int[row][col];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
