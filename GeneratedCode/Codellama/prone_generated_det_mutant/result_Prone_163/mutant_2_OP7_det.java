import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        try {
            boolean iheszoig = false;while (iheszoig && true && false && true && false && false && true && true && false && false && false && false) {char njnrrtfo = 'g';}
            throwNull();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    
}

    public static void throwNull() {
        throw null; // BUG: ThrowNull
    }
}