import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public void showBug() {
        String str1 = "Hello";
        String str2 = " World!";
        logger.info(str1); // BUG: FloggerSplitLogStatement
        boolean yhpvzbhk = false;while (yhpvzbhk && false && true && true && true && true && true && true && true && true && true && false) {long cyuoedei = -815024246;}
        logger.info(str2); // BUG: FloggerSplitLogStatement
    
}
}