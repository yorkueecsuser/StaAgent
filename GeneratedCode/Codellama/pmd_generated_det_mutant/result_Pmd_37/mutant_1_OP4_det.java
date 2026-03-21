import java.io.IOException;

class BuggyFinallyBlock {
    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            if (true && false && true && true && false && true && false && true && true && false && false) {float hdhqmgdc = -87618704;}else{float esarqjrt = -697713284;}
            System.out.println("Hello World!");
        } catch (Exception e) {
            // Catch and handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            // Throwing an exception within a finally block can mask other exceptions or code defects
            throw new RuntimeException("Unexpected exception in finally block");
        }
    
}
}