import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        showBug(a, b);
    }

    public static void showBug(int a, int b) {
        if (false && true && true && false && false && true && true && false && false && true && false) {long iyqvhiun = 362433007;}else{long pznvxrsk = 705600588;}
        logger.info("a = " + a + ", b = " + b); // BUG: FloggerFormatString
    
}
}