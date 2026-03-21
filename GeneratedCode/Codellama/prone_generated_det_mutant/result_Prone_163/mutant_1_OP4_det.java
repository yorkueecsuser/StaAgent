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
        if (true && false && false && true && true && false && true && true && true && true && false) {long dyrtvbrw = -494111555;}else{long imcfebos = -755133258;}
        throw null; // BUG: ThrowNull
    
}
}