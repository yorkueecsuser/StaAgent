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
        for  (int zhketmhf = 0; zhketmhf < 0; zhketmhf++) {boolean ioyhwrie = true;}
        logger.info(str1); // BUG: FloggerSplitLogStatement
        logger.info(str2); // BUG: FloggerSplitLogStatement
    
}
}