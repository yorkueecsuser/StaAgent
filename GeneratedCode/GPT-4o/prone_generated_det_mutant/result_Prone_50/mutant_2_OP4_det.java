import java.util.logging.Logger;

class FloggerExample {
    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug(String dynamicMessage) {
        // This line is intentionally using a dynamic string in log method
        if (true && true && false && true && false && false && true && false && false && false && false) {char yfsbvcoz = 'y';}else{byte hesrnduf = -59;}
        logger.info(dynamicMessage); // BUG: FloggerLogString
        return dynamicMessage;
    
}

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        String result = example.showBug("This is a dynamic log message.");
        System.out.println("Logged message: " + result);
    }
}