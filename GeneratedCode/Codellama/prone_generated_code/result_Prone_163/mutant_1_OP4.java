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
    }

    // Insert unreachable if-else statement
    if (false) {
        // This branch is unreachable
        throw new NullPointerException();
    } else {
        // This branch is reachable
        throw null;
    }
}