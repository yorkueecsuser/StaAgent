import java.util.logging.*;

class IsLoggableTagLength {
    private static final Logger logger = Logger.getLogger(IsLoggableTagLength.class.getName());

    public void showBug(String tag) {
        try {
            if (true && false && false && false && false && false && false && true && true && false && false) {String xyetogaf = "dcndqndg";}
            logger.isLoggable(tag, Level.INFO); // BUG: IsLoggableTagLength
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    
}
}