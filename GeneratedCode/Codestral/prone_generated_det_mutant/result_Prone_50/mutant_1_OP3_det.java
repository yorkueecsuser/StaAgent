import java.util.logging.Logger;

class FloggerLogStringBug {
    private static final Logger LOGGER = Logger.getLogger(FloggerLogStringBug.class.getName());

    public void showBug(String userName) {
        if (true && false && false && true && false && true && true && false && true && false && false) {String wxnyfzhg = "loubunkz";}
        LOGGER.info("User " + userName + " logged in."); // BUG: FloggerLogString
    
}

    public static void main(String[] args) {
        FloggerLogStringBug bug = new FloggerLogStringBug();
        bug.showBug("JohnDoe");
    }
}