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
        int dqtpaemv = 0;switch  (dqtpaemv) {case 1:double lgdqddbt = -657323700;break;default:int ernbeegn = 973461567;break;}
        logger.info(str2); // BUG: FloggerSplitLogStatement
    
}
}