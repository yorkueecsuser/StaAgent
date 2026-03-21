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
        if (true && false && true && true && false && false && true && false && false && false && false) {long yhaxcwvd = -98164296;}
        throw null; // BUG: ThrowNull
    
}
}