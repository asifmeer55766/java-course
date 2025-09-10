
public class DataTypes {

    public static void main(String args[]) {
        // data types 
        int number = 45;
        float floatNum = 45.5f;
        char letter = 'A';
        double doubleNum = 45.4;
        short shortNum = 127;

        // System.out.println("integer number: " + number);
        // System.out.println("float number : " + floatNum);
        // System.out.println("char : " + letter);
        // System.out.println("double number : " + doubleNum);
        // System.out.println("short number that have range 127 : " + shortNum);
        // type conversion 
        float intToFloat = (number);
        System.out.println("integer to floating conversion : " + intToFloat);

        int floatToint = (int) floatNum;
        System.out.println(" float to int conversion : " + floatToint);

//    type promotion
// this is type promotion where if the result is going out of range the java allow 
// you to convert in to another type  
        byte a = 10;
        byte b = 40;
        int result = a * b;
        System.out.println("result is : " + result);
    }
}
