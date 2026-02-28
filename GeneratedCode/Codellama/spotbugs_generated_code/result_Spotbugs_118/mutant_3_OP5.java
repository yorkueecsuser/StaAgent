import java.util.*;

class NPNullInstanceOfBug {
    public static void main(String[] args) {
        Object obj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        if (obj instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }

        // Unreachable switch statement
        switch (false) {
            case true:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}