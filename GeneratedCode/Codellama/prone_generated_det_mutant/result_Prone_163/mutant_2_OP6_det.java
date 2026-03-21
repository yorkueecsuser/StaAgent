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
        for  (int gnxuqvim = 0; gnxuqvim < 0; gnxuqvim++) {char yfntnboo = 'l';}
        throw null; // BUG: ThrowNull
    
}
}