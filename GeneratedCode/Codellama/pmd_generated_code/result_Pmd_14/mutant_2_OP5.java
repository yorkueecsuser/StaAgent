import java.util.*;

class AvoidInstanceofChecksInCatchClause {
    public static void main(String[] args) {
        try {
            // some code that throws an exception
            throw new Exception("Test exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // BUG: AvoidInstanceofChecksInCatchClause
            switch (e.getMessage()) {
                case "Test exception":
                    System.out.println("This is a runtime exception");
                    break;
                default:
                    System.out.println("This is an I/O exception");
                    break;
            }
        }
    }
}