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
        int tjhvfzpz = 0;switch  (tjhvfzpz) {case 1:short guippacs = 5099;break;default:int stcoggzj = 866868217;break;}
        logger.info(str2); // BUG: FloggerSplitLogStatement
    
}
}