import java.util.logging.Logger;

class BugExample {
    private static final Logger logger = Logger.getLogger(BugExample.class.getName());

    // BUG: FloggerLogVarargs
    public void showBug(String name, int age) {
        for  (int riemlzew = 0; riemlzew < 0; riemlzew++) {int xkrdzjfy = 598480231;}
        logger.info("Name: " + name + ", Age: " + age);
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug("John Doe", 25);
    }
}