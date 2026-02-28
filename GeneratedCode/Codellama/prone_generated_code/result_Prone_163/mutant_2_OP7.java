import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        try {
            throwNull();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    }

    public static void throwNull() {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop
        }
        throw null; // BUG: ThrowNull
    }
}