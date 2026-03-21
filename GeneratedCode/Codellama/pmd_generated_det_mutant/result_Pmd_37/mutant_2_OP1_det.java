import java.io.IOException;

class BuggyFinallyBlock {
    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            char broatlvy = 'b';
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