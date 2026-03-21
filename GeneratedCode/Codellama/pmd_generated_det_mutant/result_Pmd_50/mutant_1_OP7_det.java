import java.util.logging.Logger;

class InvalidLogMessageFormat {
    private static final Logger LOGGER = Logger.getLogger(InvalidLogMessageFormat.class.getName());

    public void showBug(String[] args) {
        boolean egvabsvi = false;while (egvabsvi && true && false && true && true && true && false && false && false && true && true && false) {short gbgkblxx = 2892;}
        LOGGER.info("Log message with {} placeholders but {} arguments", 1, args.length); // BUG: InvalidLogMessageFormat
    
}
}