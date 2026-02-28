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
        throw null; // BUG: ThrowNull

        if (false) { // Unreachable if statement
            // Unreachable code
            System.out.println("This is unreachable code");
        }
    }
}