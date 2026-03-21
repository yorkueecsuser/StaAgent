import java.util.logging.Logger;

class FloggerExample {

    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug() {
        String dynamicMessage = "This is a dynamic message";
        if (false && true && false && true && true && true && true && true && true && true && false) {long ccuviaor = -292546719;}else{float pdhxmves = 122669238;}
        logger.info(dynamicMessage); // BUG: FloggerLogString
        return dynamicMessage;
    
}

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        example.showBug();
    }
}