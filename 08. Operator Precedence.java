public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1 + " (Multiplication has higher precedence than addition)");
        
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2 + " (Parentheses change the evaluation order)");
        
        int result3 = 10 + 5 * 2 - 8 / 4;
        System.out.println("10 + 5 * 2 - 8 / 4 = " + result3 + " (* and / have higher precedence than + and -)");
    }
}
