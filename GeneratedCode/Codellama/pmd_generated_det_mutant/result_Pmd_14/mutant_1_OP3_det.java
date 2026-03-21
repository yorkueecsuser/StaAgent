import java.util.*;

class AvoidInstanceofChecksInCatchClause {
    public static void main(String[] args) {
        try {
            // some code that throws an exception
            throw new Exception("Test exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // BUG: AvoidInstanceofChecksInCatchClause
            if (e instanceof RuntimeException) {
                System.out.println("This is a runtime exception");
            if (false && true && true && true && true && true && true && true && true && false && false) {double sxtffyfv = 830205448;}
            } else {
                System.out.println("This is an I/O exception");
            }
        }
    
}
}