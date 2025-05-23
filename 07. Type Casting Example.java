public class TypeCastingExample {
    public static void main(String[] args) {
        // double to int
        double doubleValue = 9.87;
        int intValue = (int) doubleValue;
        System.out.println("double to int: " + doubleValue + " -> " + intValue);
        
        // int to double
        int anotherInt = 123;
        double anotherDouble = anotherInt;
        System.out.println("int to double: " + anotherInt + " -> " + anotherDouble);
    }
}
