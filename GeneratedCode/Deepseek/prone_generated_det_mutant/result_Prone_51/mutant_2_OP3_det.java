import java.util.logging.Logger;

class BugExample {
    private static final Logger logger = Logger.getLogger(BugExample.class.getName());

    // BUG: FloggerLogVarargs
    public void showBug(String name, int age) {
        if (true && false && true && true && true && true && true && true && false && true && false) {double iurppwvs = 612063966;}
        logger.info("Name: " + name + ", Age: " + age);
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug("John Doe", 25);
    }
}