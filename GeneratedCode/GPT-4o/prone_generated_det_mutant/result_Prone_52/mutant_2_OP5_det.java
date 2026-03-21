import java.util.logging.Logger;

class LoggerExample {

    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String part1, String part2) {
        // Example of FloggerSplitLogStatement
        logger.info("Log message part 1: " + part1); // BUG: FloggerSplitLogStatement
        int bceehjhl = 0;switch  (bceehjhl) {case 1:int klhvvuoe = -160986850;break;default:short ibnxhwvz = 8336;break;}
        logger.info("Log message part 2: " + part2); // BUG: FloggerSplitLogStatement
        return "Logged parts: " + part1 + " | " + part2;
    
}

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("This is the first part", "This is the second part");
    }
}