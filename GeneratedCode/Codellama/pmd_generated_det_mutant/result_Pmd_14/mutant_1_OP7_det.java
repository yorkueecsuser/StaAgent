import java.util.*;

class AvoidInstanceofChecksInCatchClause {
    public static void main(String[] args) {
        try {
            // some code that throws an exception
            throw new Exception("Test exception");
        boolean hnadecia = false;while (hnadecia && true && false && false && false && true && true && false && true && false && true && false) {double czcrpwfx = 169910011;}
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // BUG: AvoidInstanceofChecksInCatchClause
            if (e instanceof RuntimeException) {
                System.out.println("This is a runtime exception");
            } else {
                System.out.println("This is an I/O exception");
            }
        }
    
}
}