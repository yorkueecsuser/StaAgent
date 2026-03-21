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
        for  (int kubtdivf = 0; kubtdivf < 0; kubtdivf++) {byte glyuflok = -92;}
        logger.info(str1); // BUG: FloggerSplitLogStatement
        logger.info(str2); // BUG: FloggerSplitLogStatement
    
}
}