import java.util.Formatter;
import java.text.MessageFormat;
import java.util.logging.Logger;
import java.util.logging.Level;

class PrintfStyleFormatBugDemo {

    public String showBug1() {
        // Noncompliant; an 'int' is expected rather than a String
        return String.format("The value of my integer is %d", "Hello World"); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug2() {
        // Noncompliant; X is not a supported time conversion character
        Formatter formatter = new Formatter();
        return formatter.format("Duke's Birthday year is %tX", System.currentTimeMillis()).toString(); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug3() {
        // Noncompliant; arguments are numbered starting from 1
        return String.format("Display %0$d and then %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug4() {
        // Noncompliant; the second argument is missing
        return String.format("Not enough arguments %d and %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug5() {
        // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
        return String.format("%< is equals to %d", 2); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug6(Object value) {
        // Noncompliant; Not enough arguments. (first element is {0})
        return MessageFormat.format("Result {1}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug7(Object value) {
        // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        return MessageFormat.format("Result {{0}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug8(Object value) {
        // Noncompliant; Unbalanced number of quotes (single quote must be escaped)
        return MessageFormat.format("Result ' {0}", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public void showBug9() {
        Logger logger = Logger.getLogger(PrintfStyleFormatBugDemo.class.getName());
        // Noncompliant - Not enough arguments.
        logger.log(Level.SEVERE, "Result {1}!", 14); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    // Mutated code
    public String showBug1_mutated() {
        // Noncompliant; an 'int' is expected rather than a String
        String a = "Hello World";
        return String.format("The value of my integer is %d", a); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug2_mutated() {
        // Noncompliant; X is not a supported time conversion character
        Formatter b = new Formatter();
        return b.format("Duke's Birthday year is %tX", System.currentTimeMillis()).toString(); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug3_mutated() {
        // Noncompliant; arguments are numbered starting from 1
        int c = 1;
        return String.format("Display %0$d and then %d", c); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug4_mutated() {
        // Noncompliant; the second argument is missing
        int d = 1;
        return String.format("Not enough arguments %d and %d", d); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug5_mutated() {
        // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
        int e = 2;
        return String.format("%< is equals to %d", e); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug6_mutated(Object f) {
        // Noncompliant; Not enough arguments. (first element is {0})
        return MessageFormat.format("Result {1}.", f); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug7_mutated(Object g) {
        // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        return MessageFormat.format("Result {{0}.", g); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public String showBug8_mutated(Object h) {
        // Noncompliant; Unbalanced number of quotes (single quote must be escaped)
        return MessageFormat.format("Result ' {0}", h); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    public void showBug9_mutated() {
        Logger i = Logger.getLogger(PrintfStyleFormatBugDemo.class.getName());
        // Noncompliant - Not enough arguments.
        i.log(Level.SEVERE, "Result {1}!", 14); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
}