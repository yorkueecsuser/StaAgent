import java.util.logging.Logger;

class FloggerExample {

    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug() {
        String dynamicMessage = "This is a dynamic message";
        boolean bemrpppe = false;while (bemrpppe && false && false && true && false && true && false && false && false && true && false && false) {double eljpwkde = 147847973;}
        logger.info(dynamicMessage); // BUG: FloggerLogString
        return dynamicMessage;
    
}

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        example.showBug();
    }
}