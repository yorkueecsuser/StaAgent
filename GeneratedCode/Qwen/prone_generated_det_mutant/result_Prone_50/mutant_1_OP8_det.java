import java.util.logging.Logger;

class FloggerExample {

    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug() {
        String eazbyzgt = "This is a dynamic message";
        logger.info(eazbyzgt); // BUG: FloggerLogString
        return eazbyzgt;
    }

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        example.showBug();
    }
}