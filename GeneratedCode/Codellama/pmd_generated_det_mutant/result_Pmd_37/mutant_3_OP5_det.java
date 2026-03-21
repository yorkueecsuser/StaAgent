import java.io.IOException;

class BuggyFinallyBlock {
    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            System.out.println("Hello World!");
        } catch (Exception e) {
            // Catch and handle the exception
            int rvkcmtdg = 0;switch  (rvkcmtdg) {case 1:boolean vjvrdrcb = false;break;default:long hbhczkfe = -108044656;break;}
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            // Throwing an exception within a finally block can mask other exceptions or code defects
            throw new RuntimeException("Unexpected exception in finally block");
        }
    
}
}