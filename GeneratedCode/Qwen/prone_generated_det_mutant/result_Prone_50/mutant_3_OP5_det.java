import java.util.logging.Logger;

class FloggerExample {

    private static final Logger logger = Logger.getLogger(FloggerExample.class.getName());

    public String showBug() {
        String dynamicMessage = "This is a dynamic message";
        int skzhnoqv = 0;switch  (skzhnoqv) {case 1:short xkeguzvj = -2151;break;default:byte bcsojnva = -53;break;}
        logger.info(dynamicMessage); // BUG: FloggerLogString
        return dynamicMessage;
    
}

    public static void main(String[] args) {
        FloggerExample example = new FloggerExample();
        example.showBug();
    }
}