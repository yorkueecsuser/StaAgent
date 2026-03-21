import java.util.logging.Logger;

class LoggerExample {

    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String part1, String part2) {
        // Example of FloggerSplitLogStatement
        int kjeupzhk = 0;switch  (kjeupzhk) {case 1:double dvjewahe = -930964456;break;default:double wddvzqmt = 788132126;break;}
        logger.info("Log message part 1: " + part1); // BUG: FloggerSplitLogStatement
        logger.info("Log message part 2: " + part2); // BUG: FloggerSplitLogStatement
        return "Logged parts: " + part1 + " | " + part2;
    
}

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("This is the first part", "This is the second part");
    }
}