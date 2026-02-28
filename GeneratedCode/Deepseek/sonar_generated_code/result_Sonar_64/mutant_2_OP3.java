import java.util.logging.Level;
import java.util.logging.Logger;

class BugExample {

    /**
     * Method to demonstrate the noncompliant code.
     *
     * @param x The value to check
     */
    public static void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");  // BUG: Exceptions should not be created without being thrown
    }

    /**
     * Method to demonstrate the compliant solution.
     *
     * @param x The value to check
     */
    public static void showBugFixed(int x) {
        if (x < 0)
            throw new IllegalArgumentException("x must be nonnegative");
    }

    /**
     * Method to demonstrate the noncompliant code with the unreachable if statement mutation.
     *
     * @param x The value to check
     */
    public static void showBugMutant(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");
        
        boolean condition = false;
        if (condition) {
            // This branch will never be executed
            System.out.println("This code is unreachable");
        }
    }

    /**
     * Method to demonstrate the compliant solution with the unreachable if statement mutation.
     *
     * @param x The value to check
     */
    public static void showBugFixedMutant(int x) {
        if (x < 0)
            throw new IllegalArgumentException("x must be nonnegative");
        
        boolean condition = false;
        if (condition) {
            // This branch will never be executed
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        try {
            showBug(1);
            showBug(-1);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(BugExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showBugFixed(1);
            showBugFixed(-1);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(BugExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showBugMutant(1);
            showBugMutant(-1);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(BugExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showBugFixedMutant(1);
            showBugFixedMutant(-1);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(BugExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}