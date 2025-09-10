
public class Conditions {

    public static void main(String args[]) {
        int num = 0;
        // if (num == 10) {
        //     System.out.println("number is 10 ");
        // } else {
        //     System.out.println("number is not  10 ");

        // }
        if (num == 10) {
            System.out.println("number is  10 ");
        } else if (num < 10) {
            System.out.println("number is less then  10 ");
        } else if (num > 10) {
            System.out.println("number is greater then  10 ");
        } else {
            System.out.println("Default behavoiur  ");

        }

        // ternary operators 
        int numb = 30;
        int result = 0;
        result = numb > 20 ? 20 : 10;
        System.out.println(result);
    }
}
