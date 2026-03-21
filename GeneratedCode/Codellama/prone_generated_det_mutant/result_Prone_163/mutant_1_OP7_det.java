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
        boolean tvecumoj = false;while (tvecumoj && false && false && false && true && true && true && false && false && true && true && false) {double nbrulzep = 885205860;}
        throw null; // BUG: ThrowNull
    
}
}