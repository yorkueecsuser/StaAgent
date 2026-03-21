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
        if (true && false && true && true && false && true && false && true && false && false && false) {short yuoywokw = 5294;}else{long cpdbnzam = 936533389;}
        throw null; // BUG: ThrowNull
    
}
}