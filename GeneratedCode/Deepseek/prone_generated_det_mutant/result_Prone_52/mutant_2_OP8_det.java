import java.util.logging.Logger;

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public void showBug() {
        String wevyjxpx = "Hello";
        String gumpfxzq = " World!";
        logger.info(wevyjxpx); // BUG: FloggerSplitLogStatement
        logger.info(gumpfxzq); // BUG: FloggerSplitLogStatement
    }
}