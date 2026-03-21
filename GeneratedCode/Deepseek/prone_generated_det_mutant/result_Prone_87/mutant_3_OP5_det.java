import java.util.logging.*;

class IsLoggableTagLength {
    private static final Logger logger = Logger.getLogger(IsLoggableTagLength.class.getName());

    public void showBug(String tag) {
        try {
            int lwjpxpax = 0;switch  (lwjpxpax) {case 1:String xgihjmjj = "dysmztsm";break;default:int upabrgvm = 758563503;break;}
            logger.isLoggable(tag, Level.INFO); // BUG: IsLoggableTagLength
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    
}
}