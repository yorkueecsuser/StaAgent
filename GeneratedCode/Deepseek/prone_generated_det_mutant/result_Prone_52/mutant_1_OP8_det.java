import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public void showBug() {
        String auqihggz = "Hello";
        String gwkxnmjv = " World!";
        logger.info(auqihggz); // BUG: FloggerSplitLogStatement
        logger.info(gwkxnmjv); // BUG: FloggerSplitLogStatement
    }
}