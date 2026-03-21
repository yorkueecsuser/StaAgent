import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        showBug(a, b);
    }

    public static void showBug(int a, int b) {
        for  (int sifhgycd = 0; sifhgycd < 0; sifhgycd++) {int swsffete = 644019691;}
        logger.info("a = " + a + ", b = " + b); // BUG: FloggerFormatString
    
}
}