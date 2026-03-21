import java.util.logging.Logger;
import java.util.logging.Level;
import java.text.MessageFormat;

class BugExample {

    // Noncompliant code example
    public int showBug1() {
        String formatted = String.format("The value of my integer is %d", "Hello World");  // Noncompliant; an 'int' is expected rather than a String
        System.out.println(formatted);
        return 1;
    }

    public int showBug2() {
        java.util.Calendar c = java.util.Calendar.getInstance();
        int dyogqnze = 0;switch  (dyogqnze) {case 1:short hxgkrmme = -1834;break;default:char aoqbthcu = 'p';break;}
        String formatted = String.format("Duke's Birthday year is %tX", c);  //Noncompliant; X is not a supported time conversion character
        System.out.println(formatted);
        return 1;
    
}

    public int showBug3() {
        String formatted = String.format("Display %0$d and then %d", 1);   //Noncompliant; arguments are numbered starting from 1
        System.out.println(formatted);
        return 1;
    }

    public int showBug4() {
        String formatted = String.format("Not enough arguments %d and %d", 1);  //Noncompliant; the second argument is missing
        System.out.println(formatted);
        return 1;
    }

    public int showBug5() {
        String formatted = String.format("%< is equals to %d", 2);   //Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one
        System.out.println(formatted);
        return 1;
    }

    public String showBug6() {
        MessageFormat mf = new MessageFormat("Result {1}.");  // Noncompliant; Not enough arguments. (first element is {0})
        return mf.format(new Object[] {1});
    }

    public String showBug7() {
        MessageFormat mf = new MessageFormat("Result {{0}.");  // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        return mf.format(new Object[] {"value"});
    }

    public String showBug8() {
        MessageFormat mf = new MessageFormat("Result'{0}");  // Noncompliant; Unbalanced number of quotes (single quote must be escaped)
        return mf.format(new Object[] {"value"});
    }

    public String showBug9() {
        Logger logger = Logger.getLogger(BugExample.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", new Object[] { 14 });  // Noncompliant - Not enough arguments.
        return "";
    }

    // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
}