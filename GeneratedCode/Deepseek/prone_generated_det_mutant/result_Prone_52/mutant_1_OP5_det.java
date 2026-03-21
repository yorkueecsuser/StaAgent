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
        int zihprozq = 0;switch  (zihprozq) {case 1:long rulyyomn = 858040293;break;default:byte exwypmdv = 72;break;}
        logger.info(str1); // BUG: FloggerSplitLogStatement
        logger.info(str2); // BUG: FloggerSplitLogStatement
    
}
}