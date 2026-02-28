import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);

        // Mutation operator: Unreachable switch statement
        // Insert an unreachable switch statement to make the code unreachable
        int value = 0;
        switch(value) {
            case 1: // This case will never be reached
                // Add code here
                break;
            default: // This default case will always be reached
                // Add code here
                break;
        }
    }
}