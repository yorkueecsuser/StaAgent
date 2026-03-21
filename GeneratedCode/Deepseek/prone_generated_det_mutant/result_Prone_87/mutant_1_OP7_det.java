import java.util.logging.*;

class IsLoggableTagLength {
    private static final Logger logger = Logger.getLogger(IsLoggableTagLength.class.getName());

    public void showBug(String tag) {
        try {
            boolean blgudlvw = false;while (blgudlvw && false && true && false && false && false && false && true && false && true && false && false) {double mchsajxx = 639787647;}
            logger.isLoggable(tag, Level.INFO); // BUG: IsLoggableTagLength
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    
}
}