import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public void showBug() {
        String whtytfvg = "Hello";
        String szqnnrfk = " World!";
        logger.info(whtytfvg); // BUG: FloggerSplitLogStatement
        logger.info(szqnnrfk); // BUG: FloggerSplitLogStatement
    }
}