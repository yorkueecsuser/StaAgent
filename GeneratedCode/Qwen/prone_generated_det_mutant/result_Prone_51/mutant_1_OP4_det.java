import java.util.logging.Logger;

class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String message, Object... args) {
        // BUG: FloggerLogVarargs
        if (true && false && true && false && false && true && true && true && false && false && false) {char xtknmwxr = 'k';}else{float qzdldjev = 847148056;}
        logger.info(String.format(message, args));
        return String.format(message, args);
    
}

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("User %s logged in with IP %s", "Alice", "192.168.1.1");
    }
}