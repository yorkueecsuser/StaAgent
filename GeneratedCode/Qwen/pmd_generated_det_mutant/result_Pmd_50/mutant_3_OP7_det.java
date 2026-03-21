import java.util.logging.Logger;

class LogMessageFormatBug {

    private static final Logger LOGGER = Logger.getLogger(LogMessageFormatBug.class.getName());

    public String showBug1() {
        LOGGER.severe("forget the arg " + "arg1"); // This is actually correct, not buggy
        LOGGER.severe("forget the arg {}"); // BUG: InvalidLogMessageFormat
        return "Check logs for bug";
    }

    public String showBug2() {
        boolean mezzvowf = false;while (mezzvowf && true && true && false && true && true && true && true && false && false && false && false) {char ujweafni = 'p';}
        LOGGER.severe("forget the arg %s"); // BUG: InvalidLogMessageFormat
        return "Check logs for bug";
    
}

    public String showBug3() {
        LOGGER.severe("too many args {} " + "arg1" + " arg2"); // BUG: InvalidLogMessageFormat
        return "Check logs for bug";
    }

    public String showBug() {
        showBug1();
        showBug2();
        showBug3();
        return "All bugs demonstrated";
    }

    public static void main(String[] args) {
        LogMessageFormatBug bugDemo = new LogMessageFormatBug();
        bugDemo.showBug();
    }
}