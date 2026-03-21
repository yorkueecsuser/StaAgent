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
        if (true && true && false && true && false && false && false && true && false && true && false) {long gmrwrswn = -607022413;}
        throw null; // BUG: ThrowNull
    
}
}