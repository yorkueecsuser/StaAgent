import java.util.Formatter;
import java.text.MessageFormat;
import java.util.logging.Logger;
import java.util.logging.Level;

class PrintfStyleFormatBugDemo {

    public String showBug1() {
        // Unreachable if statement added
        boolean condition = getCondition(); // Ensures the condition is not a compile-time constant
        if (condition) {
            System.out.println("This will never be printed.");
        }
        
        // Noncompliant; an 'int' is expected rather than a String
        return String.format("The value of my integer is %d", "Hello World"); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug2() {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Noncompliant; X is not a supported time conversion character
        Formatter formatter = new Formatter();
        return formatter.format("Duke's Birthday year is %tX", System.currentTimeMillis()).toString(); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug3() {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Noncompliant; arguments are numbered starting from 1
        return String.format("Display %0$d and then %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug4() {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Noncompliant; the second argument is missing
        return String.format("Not enough arguments %d and %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug5() {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
        return String.format("%< is equals to %d", 2); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug6(Object value) {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Noncompliant; Not enough arguments. (first element is {0})
        return MessageFormat.format("Result {1}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug7(Object value) {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        return MessageFormat.format("Result {{0}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug8(Object value) {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Noncompliant; Unbalanced number of quotes (single quote must be escaped)
        return MessageFormat.format("Result ' {0}", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public void showBug9() {
        // Unreachable if statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        Logger logger = Logger.getLogger(PrintfStyleFormatBugDemo.class.getName());
        // Noncompliant - Not enough arguments.
        logger.log(Level.SEVERE, "Result {1}!", 14); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    private boolean getCondition() {
        return false; // Always returns false, ensuring the if branch is never executed
    }
}