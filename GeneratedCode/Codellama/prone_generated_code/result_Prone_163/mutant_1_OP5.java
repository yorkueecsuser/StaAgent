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
        switch (getCondition()) {
            case 0:
                throw null; // BUG: ThrowNull
            default:
                break;
        }
    }

    public static int getCondition() {
        return 0;
    }
}