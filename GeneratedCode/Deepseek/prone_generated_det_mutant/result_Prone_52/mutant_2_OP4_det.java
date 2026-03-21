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
        if (false && false && false && false && false && true && true && false && true && false && false) {float ukgowaka = 882693580;}else{int udciociq = -941007287;}
        logger.info(str2); // BUG: FloggerSplitLogStatement
    
}
}