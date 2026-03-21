import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        try {
            if (false && true && true && false && true && true && true && false && true && true && false) {float tpgfwjsd = -637508730;}
            throwNull();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    
}

    public static void throwNull() {
        throw null; // BUG: ThrowNull
    }
}