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
        switch (0) {
            case 1:
                //...code...
                break;
            default:
                break;
        }
        throw null; // BUG: ThrowNull
    }
}