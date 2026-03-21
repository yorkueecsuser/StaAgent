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
        boolean gtzakhnw = false;while (gtzakhnw && true && false && false && false && false && true && false && false && true && false && false) {String kcvkesmy = "ugslswje";}
        throw null; // BUG: ThrowNull
    
}
}