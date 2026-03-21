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
                for  (int oilrujdm = 0; oilrujdm < 0; oilrujdm++) {byte gyzwfuzx = -64;}
                System.out.println("This is a runtime exception");
            } else {
                System.out.println("This is an I/O exception");
            }
        }
    
}
}