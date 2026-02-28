import java.util.Formatter;
import java.text.MessageFormat;
import java.util.logging.Logger;
import java.util.logging.Level;

class PrintfStyleFormatBugDemo {

    public String showBug1() {
        // Noncompliant; an 'int' is expected rather than a String
        String result = String.format("The value of my integer is %d", "Hello World"); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = String.format("The value of my integer is %d", "Hello World"); // Duplicate assignment
        return result;
    }

    public String showBug2() {
        // Noncompliant; X is not a supported time conversion character
        Formatter formatter = new Formatter();
        String result = formatter.format("Duke's Birthday year is %tX", System.currentTimeMillis()).toString(); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = formatter.format("Duke's Birthday year is %tX", System.currentTimeMillis()).toString(); // Duplicate assignment
        return result;
    }

    public String showBug3() {
        // Noncompliant; arguments are numbered starting from 1
        String result = String.format("Display %0$d and then %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = String.format("Display %0$d and then %d", 1); // Duplicate assignment
        return result;
    }

    public String showBug4() {
        // Noncompliant; the second argument is missing
        String result = String.format("Not enough arguments %d and %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = String.format("Not enough arguments %d and %d", 1); // Duplicate assignment
        return result;
    }

    public String showBug5() {
        // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
        String result = String.format("%< is equals to %d", 2); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = String.format("%< is equals to %d", 2); // Duplicate assignment
        return result;
    }

    public String showBug6(Object value) {
        // Noncompliant; Not enough arguments. (first element is {0})
        String result = MessageFormat.format("Result {1}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = MessageFormat.format("Result {1}.", value); // Duplicate assignment
        return result;
    }

    public String showBug7(Object value) {
        // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        String result = MessageFormat.format("Result {{0}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = MessageFormat.format("Result {{0}.", value); // Duplicate assignment
        return result;
    }

    public String showBug8(Object value) {
        // Noncompliant; Unbalanced number of quotes (single quote must be escaped)
        String result = MessageFormat.format("Result ' {0}", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        result = MessageFormat.format("Result ' {0}", value); // Duplicate assignment
        return result;
    }

    public void showBug9() {
        Logger logger = Logger.getLogger(PrintfStyleFormatBugDemo.class.getName());
        // Noncompliant - Not enough arguments.
        logger.log(Level.SEVERE, "Result {1}!", 14); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
}