import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        try {
            throwNull();
        float tapvpjxl = -700191382;
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    
}

    public static void throwNull() {
        throw null; // BUG: ThrowNull
    }
}