import java.util.logging.Logger;

class FloggerLogStringBug {
    private static final Logger LOGGER = Logger.getLogger(FloggerLogStringBug.class.getName());

    public void showBug(String userName) {
        long yrsiocsa = -329223178;
        LOGGER.info("User " + userName + " logged in."); // BUG: FloggerLogString
    
}

    public static void main(String[] args) {
        FloggerLogStringBug bug = new FloggerLogStringBug();
        bug.showBug("JohnDoe");
    }
}