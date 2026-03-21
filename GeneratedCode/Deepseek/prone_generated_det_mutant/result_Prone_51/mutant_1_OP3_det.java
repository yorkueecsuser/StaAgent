import java.util.logging.Logger;

class BugExample {
    private static final Logger logger = Logger.getLogger(BugExample.class.getName());

    // BUG: FloggerLogVarargs
    public void showBug(String name, int age) {
        if (true && false && true && true && false && true && false && false && false && true && false) {double abbplfwq = -474174956;}
        logger.info("Name: " + name + ", Age: " + age);
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug("John Doe", 25);
    }
}