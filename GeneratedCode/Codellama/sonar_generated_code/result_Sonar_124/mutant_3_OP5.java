import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);

        // Mutation Operator: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            default:
                System.out.println("Default case");
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}