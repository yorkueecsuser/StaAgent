import java.util.logging.Logger;

class FloggerExample {

    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug() {
        String cwzwfppm = "This is a dynamic message";
        logger.info(cwzwfppm); // BUG: FloggerLogString
        return cwzwfppm;
    }

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        example.showBug();
    }
}