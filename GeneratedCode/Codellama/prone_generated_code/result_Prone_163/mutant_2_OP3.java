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
        if (false) { // Unreachable if statement
            System.out.println("This statement is unreachable");
        }
        throw null; // BUG: ThrowNull
    }
}