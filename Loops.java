
public class Loops {

    public static void main(String args[]) {
        // there 3 types of loops in java 
        // 1 for loops
        // 2 while loops 
        // 3 do while loops 
        // 4 for each (optional) ehhanced type of for loops 

        // 1 for loops 
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        // 2 while loops 
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 3 do while loops 
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);

        System.out.println();
//  4 ehhanced for loops , for each useful to iterate arrays 
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
