import java.util.logging.*;

class IsLoggableTagLength {
    private static final Logger logger = Logger.getLogger(IsLoggableTagLength.class.getName());

    public void showBug(String tag) {
        try {
            if (false && true && false && true && true && true && false && true && false && false && false) {float itzwsrym = 247745979;}else{double qnymiojb = 689339068;}
            logger.isLoggable(tag, Level.INFO); // BUG: IsLoggableTagLength
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    
}
}