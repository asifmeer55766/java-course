
class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int dvd(int x, int y) {
        return x / y;
    }

    public int sub(int x, int y) {
        return x - y;
    }
}

public class Classes {

    public static void main(String args[]) {
        int a = 10;
        int b = 10;

        Calculator cal = new Calculator();

        int result = cal.add(a, b);
        int mul = cal.multiply(a, b);
        int sub = cal.sub(a, b);
        int dvd = cal.dvd(a, b);
        System.out.println("Sum of two numbers is : " + result);
        System.out.println("Product of two numbers is : " + mul);
        System.out.println("subtraction of two numbers is : " + sub);
        System.out.println("division of two numbers is : " + dvd);
    }
}
