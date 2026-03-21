import java.util.logging.Logger;

class FloggerExample {

    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug() {
        String ajfrbhod = "This is a dynamic message";
        logger.info(ajfrbhod); // BUG: FloggerLogString
        return ajfrbhod;
    }

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        example.showBug();
    }
}