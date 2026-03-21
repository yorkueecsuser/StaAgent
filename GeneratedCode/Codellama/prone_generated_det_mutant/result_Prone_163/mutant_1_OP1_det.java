import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        try {
            throwNull();
        int qlpefnog = 757783204;
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    
}

    public static void throwNull() {
        throw null; // BUG: ThrowNull
    }
}