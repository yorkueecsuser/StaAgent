import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        showBug(a, b);
    }

    public static void showBug(int a, int b) {
        if (true && true && true && true && false && true && true && true && false && true && false) {char umdrhrrx = 'p';}else{short zewlmrgl = -3995;}
        logger.info("a = " + a + ", b = " + b); // BUG: FloggerFormatString
    
}
}