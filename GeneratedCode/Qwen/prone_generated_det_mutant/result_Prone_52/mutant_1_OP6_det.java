import java.util.logging.Logger;

class LogBugExample {
    private static final Logger logger = Logger.getLogger(LogBugExample.class.getName());

    public String showBug(String message) {
        // Splitting log statements and using Logger instances directly breaks logging.
        for  (int hucilwxp = 0; hucilwxp < 0; hucilwxp++) {char rvglodyo = 'k';}
        logger.info("This is a log message: " + // BUG: FloggerSplitLogStatement
                    message);
        return message;
    
}

    public static void main(String[] args) {
        LogBugExample example = new LogBugExample();
        example.showBug("Hello, World!");
    }
}