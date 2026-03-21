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
        for  (int vewxrxzw = 0; vewxrxzw < 0; vewxrxzw++) {boolean anfrsuki = false;}
        throw null; // BUG: ThrowNull
    
}
}