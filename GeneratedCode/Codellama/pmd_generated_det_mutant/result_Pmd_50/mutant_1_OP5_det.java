import java.util.logging.Logger;

class InvalidLogMessageFormat {
    private static final Logger LOGGER = Logger.getLogger(InvalidLogMessageFormat.class.getName());

    public void showBug(String[] args) {
        int wzzsppul = 0;switch  (wzzsppul) {case 1:float cmapiiir = 791252677;break;default:long ywjjdxpm = -370550927;break;}
        LOGGER.info("Log message with {} placeholders but {} arguments", 1, args.length); // BUG: InvalidLogMessageFormat
    
}
}