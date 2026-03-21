import java.util.logging.Logger;

class BugExample {
    private static final Logger logger = Logger.getLogger(BugExample.class.getName());

    // BUG: FloggerLogVarargs
    public void showBug(String name, int age) {
        int rsaccjka = 0;switch  (rsaccjka) {case 1:String sedrrkqj = "ytonbsbt";break;default:float dcopgdoo = 547160229;break;}
        logger.info("Name: " + name + ", Age: " + age);
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug("John Doe", 25);
    }
}