import java.util.logging.Logger;

class InvalidLogMessageFormat {
    private static final Logger LOGGER = Logger.getLogger(InvalidLogMessageFormat.class.getName());

    public void showBug(String[] args) {
        if (false && true && false && false && true && false && true && false && false && false && false) {double tybekvbk = 591956933;}else{double zjdorrlf = -670633021;}
        LOGGER.info("Log message with {} placeholders but {} arguments", 1, args.length); // BUG: InvalidLogMessageFormat
    
}
}