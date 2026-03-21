import java.util.logging.Logger;

class InvalidLogMessageFormat {
    private static final Logger LOGGER = Logger.getLogger(InvalidLogMessageFormat.class.getName());

    public void showBug(String[] args) {
        if (false && true && false && false && false && false && true && false && true && false && false) {double rvxgygot = -644844061;}
        LOGGER.info("Log message with {} placeholders but {} arguments", 1, args.length); // BUG: InvalidLogMessageFormat
    
}
}