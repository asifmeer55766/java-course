
public class Operators {

    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 34;
        System.out.println("sum is : " + (num1 + num2));
        System.out.println("sub is : " + (num1 - num2));
        System.out.println("product is : " + (num1 * num2));
        System.out.println("division is : " + (num1 / num2));
        System.out.println("remainder is : " + (num1 % num2));
        System.out.println("post increment is : " + (num1++));//45
        System.out.println("pre increment is : " + (++num1));//45+1+1 = 47
        System.out.println("post decrement is : " + (num1--));//47
        System.out.println("pre decrement is : " + (--num1));//47-1-1 = 45

        // 2. Assignment Operators: Used to assign values to variables.
        // +=, -=, *=, /=, %= (Compound assignment operators)
        System.out.println("+= " + (num1 += num1));
        System.out.println("-= " + (num1 -= num1));
        System.out.println("*= " + (num1 *= num1));
        System.out.println("/= " + (num1 /= num2));
        System.out.println("%= " + (num1 %= num2));

    }
}
