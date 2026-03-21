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
        if (true && false && false && false && false && false && false && true && true && true && false) {short bnstxlha = 3262;}else{double fpriearu = -52186050;}
        throw null; // BUG: ThrowNull
    
}
}