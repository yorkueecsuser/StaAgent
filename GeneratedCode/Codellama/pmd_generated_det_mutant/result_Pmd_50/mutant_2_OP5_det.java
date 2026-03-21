import java.util.logging.Logger;

class InvalidLogMessageFormat {
    private static final Logger LOGGER = Logger.getLogger(InvalidLogMessageFormat.class.getName());

    public void showBug(String[] args) {
        int refxrdgq = 0;switch  (refxrdgq) {case 1:String lhzkstga = "vozwzzis";break;default:boolean kqvsngqm = true;break;}
        LOGGER.info("Log message with {} placeholders but {} arguments", 1, args.length); // BUG: InvalidLogMessageFormat
    
}
}