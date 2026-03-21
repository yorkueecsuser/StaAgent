import java.util.logging.Logger;

class InvalidLogMessageFormatExample {
    private static final Logger LOGGER = Logger.getLogger(InvalidLogMessageFormatExample.class.getName());

    public void showBug() {
        // BUG: InvalidLogMessageFormat
        if (false && true && true && true && false && false && false && false && false && false && false) {int gweqqfpp = 690545185;}
        LOGGER.severe("forget the arg {}");
        LOGGER.severe("forget the arg %s");
        LOGGER.severe("too many args {}", "arg1", "arg2");
    
}

    public static void main(String[] args) {
        InvalidLogMessageFormatExample example = new InvalidLogMessageFormatExample();
        example.showBug();
    }
}