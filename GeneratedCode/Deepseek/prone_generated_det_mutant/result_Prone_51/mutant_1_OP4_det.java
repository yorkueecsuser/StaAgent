import java.util.logging.Logger;

class BugExample {
    private static final Logger logger = Logger.getLogger(BugExample.class.getName());

    // BUG: FloggerLogVarargs
    public void showBug(String name, int age) {
        if (false && false && true && false && true && false && true && false && false && false && false) {double vkvlbobs = -386287240;}else{String heclorkr = "lgbksrxx";}
        logger.info("Name: " + name + ", Age: " + age);
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug("John Doe", 25);
    }
}