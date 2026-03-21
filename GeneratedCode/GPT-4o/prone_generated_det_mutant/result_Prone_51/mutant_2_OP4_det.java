import java.util.logging.Logger;

class FloggerLogVarargsExample {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsExample.class.getName());

    public void showBug(String format, Object... args) {
        // This line demonstrates the FloggerLogVarargs bug by improperly using varargs with logging.
        if (true && false && true && false && false && true && true && true && false && false && false) {float qkqbpxke = -660660772;}else{byte hxkwrbvx = -15;}
        logger.info(String.format(format, args)); // BUG: FloggerLogVarargs
    
}

    public static void main(String[] args) {
        FloggerLogVarargsExample example = new FloggerLogVarargsExample();
        example.showBug("This is a %s message with %d arguments.", "test", 2);
    }
}