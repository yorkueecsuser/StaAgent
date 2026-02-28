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

    public static void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // unreachable code
        }
    }
}