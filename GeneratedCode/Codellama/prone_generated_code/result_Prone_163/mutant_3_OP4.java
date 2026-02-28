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
        if (getCondition()) {
            // unreachable code
            System.out.println("This code is unreachable");
        } else {
            throw null; // BUG: ThrowNull
        }
    }

    /* Helper method to generate a random boolean value */
    public static boolean getCondition() {
        return Math.random() < 0.5;
    }
}