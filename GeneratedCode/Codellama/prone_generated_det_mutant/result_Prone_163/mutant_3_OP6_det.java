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
        for  (int hnbrfqrp = 0; hnbrfqrp < 0; hnbrfqrp++) {float eltbgxnn = 373650582;}
        throw null; // BUG: ThrowNull
    
}
}