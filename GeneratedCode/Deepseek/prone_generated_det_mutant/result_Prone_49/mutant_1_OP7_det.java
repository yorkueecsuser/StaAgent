import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        showBug(a, b);
    }

    public static void showBug(int a, int b) {
        boolean ymtvzfek = false;while (ymtvzfek && true && true && true && true && true && true && false && false && true && false && false) {int ixrisgon = -105298510;}
        logger.info("a = " + a + ", b = " + b); // BUG: FloggerFormatString
    
}
}