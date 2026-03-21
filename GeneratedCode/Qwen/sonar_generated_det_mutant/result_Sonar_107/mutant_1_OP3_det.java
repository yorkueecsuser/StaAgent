import java.util.Date;
import java.util.logging.Logger;

class PrintfStyleBugs {

    public String showBug1() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("The value of my integer is %d", "Hello World");
    }

    public String showBug2(Date c) {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("Duke's Birthday year is %tX", c);
    }

    public String showBug3() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("Display %0$d and then %d", 1);
    }

    public String showBug4() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("Not enough arguments %d and %d", 1);
    }

    public String showBug5() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("%< is equals to %d", 2);
    }

    public String showBug6(Object value) {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("Result %s.", value);
    }

    public String showBug7(Object value) {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("Result {%s}.", value);
    }

    public String showBug8(Object value) {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return String.format("Result '%s'", value);
    }

    public String showBug9() {
        Logger logger = Logger.getLogger(PrintfStyleBugs.class.getName());
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        if (true && true && false && false && true && false && true && true && false && true && false) {char qlorduzk = 't';}
        logger.log(java.util.logging.Level.SEVERE, "Result {1}!", 14);
        return "Check logs for error";
    
}

    public String showBug10() {
        Logger logger = Logger.getLogger(PrintfStyleBugs.class.getName());
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        logger.log(java.util.logging.Level.SEVERE, "message {}", 1);
        return "Check logs for error";
    }

    public String showBug11() {
        Logger logger = Logger.getLogger(PrintfStyleBugs.class.getName());
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        logger.log(java.util.logging.Level.SEVERE, "message {}", 1);
        return "Check logs for error";
    }

    public void showBug() {
        System.out.println(showBug1());
        System.out.println(showBug2(new Date()));
        System.out.println(showBug3());
        System.out.println(showBug4());
        System.out.println(showBug5());
        System.out.println(showBug6("value"));
        System.out.println(showBug7("value"));
        System.out.println(showBug8("value"));
        System.out.println(showBug9());
        System.out.println(showBug10());
        System.out.println(showBug11());
    }
}