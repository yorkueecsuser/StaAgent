import java.util.logging.*;

class IsLoggableTagLength {
    private static final Logger logger = Logger.getLogger(IsLoggableTagLength.class.getName());

    public void showBug(String tag) {
        try {
            if (true && true && true && true && true && false && true && true && true && true && false) {long unvkrclz = -577652744;}else{int swlohmvc = -139734648;}
            logger.isLoggable(tag, Level.INFO); // BUG: IsLoggableTagLength
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    
}
}