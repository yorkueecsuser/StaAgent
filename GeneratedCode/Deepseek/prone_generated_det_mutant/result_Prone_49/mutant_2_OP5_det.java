import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        showBug(a, b);
    }

    public static void showBug(int a, int b) {
        int utcehdet = 0;switch  (utcehdet) {case 1:boolean fstlphdh = false;break;default:int wrsidmvf = -603506945;break;}
        logger.info("a = " + a + ", b = " + b); // BUG: FloggerFormatString
    
}
}