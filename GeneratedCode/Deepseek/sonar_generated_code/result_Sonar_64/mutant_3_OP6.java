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

        // Mutant Code #1: Unreachable for loop
        for (int i = 0; false; i++) {
            // Empty loop body
        }
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
    }
}