import java.util.Formatter;
import java.text.MessageFormat;
import java.util.logging.Logger;
import java.util.logging.Level;

class PrintfStyleFormatBugDemo {

    public String showBug1() {
        // Noncompliant; an 'int' is expected rather than a String
        return String.format("The value of my integer is %d", "Hello World"); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        int a = 42;
        return String.format("The value of my integer is %d", a);
    }

    public String showBug2() {
        // Noncompliant; X is not a supported time conversion character
        Formatter formatter = new Formatter();
        return formatter.format("Duke's Birthday year is %tX", System.currentTimeMillis()).toString(); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        Formatter b = new Formatter();
        return b.format("Duke's Birthday year is %tY", System.currentTimeMillis()).toString();
    }

    public String showBug3() {
        // Noncompliant; arguments are numbered starting from 1
        return String.format("Display %0$d and then %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        int c = 2;
        return String.format("Display %1$d and then %d", 1, c);
    }

    public String showBug4() {
        // Noncompliant; the second argument is missing
        return String.format("Not enough arguments %d and %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        int d = 3;
        return String.format("Not enough arguments %d and %d", 1, d);
    }

    public String showBug5() {
        // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
        return String.format("%< is equals to %d", 2); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        int e = 2;
        return String.format("%d is equals to %d", e, e);
    }

    public String showBug6(Object value) {
        // Noncompliant; Not enough arguments. (first element is {0})
        return MessageFormat.format("Result {1}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        Object f = value;
        return MessageFormat.format("Result {0}.", f);
    }

    public String showBug7(Object value) {
        // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        return MessageFormat.format("Result {{0}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        Object g = value;
        return MessageFormat.format("Result '{'{0}.", g);
    }

    public String showBug8(Object value) {
        // Noncompliant; Unbalanced number of quotes (single quote must be escaped)
        return MessageFormat.format("Result ' {0}", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        Object h = value;
        return MessageFormat.format("Result ''{0}", h);
    }

    public void showBug9() {
        Logger logger = Logger.getLogger(PrintfStyleFormatBugDemo.class.getName());
        // Noncompliant - Not enough arguments.
        logger.log(Level.SEVERE, "Result {1}!", 14); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        
        // Renaming mutation applied
        int i = 14;
        logger.log(Level.SEVERE, "Result {0}!", i);
    }
}