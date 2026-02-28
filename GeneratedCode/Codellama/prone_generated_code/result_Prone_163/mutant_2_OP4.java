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
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            throw null; // BUG: ThrowNull
        }
    }
}