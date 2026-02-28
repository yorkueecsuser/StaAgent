import java.util.Formatter;
import java.text.MessageFormat;
import java.util.logging.Logger;
import java.util.logging.Level;

class PrintfStyleFormatBugDemo {

    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug1() {
        // Noncompliant; an 'int' is expected rather than a String
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        return String.format("The value of my integer is %d", "Hello World"); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug2() {
        // Noncompliant; X is not a supported time conversion character
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        Formatter formatter = new Formatter();
        return formatter.format("Duke's Birthday year is %tX", System.currentTimeMillis()).toString(); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug3() {
        // Noncompliant; arguments are numbered starting from 1
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        return String.format("Display %0$d and then %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug4() {
        // Noncompliant; the second argument is missing
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        return String.format("Not enough arguments %d and %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug5() {
        // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        return String.format("%< is equals to %d", 2); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug6(Object value) {
        // Noncompliant; Not enough arguments. (first element is {0})
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        return MessageFormat.format("Result {1}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug7(Object value) {
        // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        return MessageFormat.format("Result {{0}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug8(Object value) {
        // Noncompliant; Unbalanced number of quotes (single quote must be escaped)
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        return MessageFormat.format("Result ' {0}", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public void showBug9() {
        Logger logger = Logger.getLogger(PrintfStyleFormatBugDemo.class.getName());
        // Noncompliant - Not enough arguments.
        while (getUnreachableCondition()) {
            // Unreachable while loop
        }
        logger.log(Level.SEVERE, "Result {1}!", 14); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
}