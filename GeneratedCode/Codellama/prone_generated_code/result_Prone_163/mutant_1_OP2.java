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
}

// Duplication mutation: Duplicate the assignment statement "throw null"
public static void throwNull() {
    throw null; // BUG: ThrowNull
    throw null; // Additional code to duplicate the assignment statement
}