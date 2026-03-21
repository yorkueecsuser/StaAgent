import java.util.logging.Logger;

class LogBugExample {
    private static final Logger logger = Logger.getLogger(LogBugExample.class.getName());

    public String showBug(String message) {
        // Splitting log statements and using Logger instances directly breaks logging.
        int lhmxbxpo = 0;switch  (lhmxbxpo) {case 1:int mlgxhjzm = -380969481;break;default:String axrxcnon = "vfbmdqhv";break;}
        logger.info("This is a log message: " + // BUG: FloggerSplitLogStatement
                    message);
        return message;
    
}

    public static void main(String[] args) {
        LogBugExample example = new LogBugExample();
        example.showBug("Hello, World!");
    }
}