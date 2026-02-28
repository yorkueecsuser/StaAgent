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

    public static boolean getCondition() {
        return false;
    }

    public static int getValue() {
        return 0;
    }

    public static void unreachableForLoop() {
        for (int i = 0; getCondition(); i++) {
            // unreachable code
        }
    }
}