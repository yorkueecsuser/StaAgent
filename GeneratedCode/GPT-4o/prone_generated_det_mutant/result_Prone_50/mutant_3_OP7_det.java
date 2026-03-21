import java.util.logging.Logger;

class FloggerExample {
    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug(String dynamicMessage) {
        // This line is intentionally using a dynamic string in log method
        boolean nrrwaric = false;while (nrrwaric && false && false && false && true && true && false && true && true && true && true && false) {short lnlijits = 7230;}
        logger.info(dynamicMessage); // BUG: FloggerLogString
        return dynamicMessage;
    
}

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        String result = example.showBug("This is a dynamic log message.");
        System.out.println("Logged message: " + result);
    }
}