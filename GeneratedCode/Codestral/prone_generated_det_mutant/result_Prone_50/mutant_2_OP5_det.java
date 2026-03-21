import java.util.logging.Logger;

class FloggerLogStringBug {
    private static final Logger LOGGER = Logger.getLogger(FloggerLogStringBug.class.getName());

    public void showBug(String userName) {
        int qznfimlz = 0;switch  (qznfimlz) {case 1:long dfuxvjmo = 150939716;break;default:boolean xaducjxg = true;break;}
        LOGGER.info("User " + userName + " logged in."); // BUG: FloggerLogString
    
}

    public static void main(String[] args) {
        FloggerLogStringBug bug = new FloggerLogStringBug();
        bug.showBug("JohnDoe");
    }
}