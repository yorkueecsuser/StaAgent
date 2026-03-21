import java.util.logging.Logger;

class FloggerLogStringBug {
    private static final Logger LOGGER = Logger.getLogger(FloggerLogStringBug.class.getName());

    public void showBug(String userName) {
        for  (int dewsmnwb = 0; dewsmnwb < 0; dewsmnwb++) {char brcibemn = 'w';}
        LOGGER.info("User " + userName + " logged in."); // BUG: FloggerLogString
    
}

    public static void main(String[] args) {
        FloggerLogStringBug bug = new FloggerLogStringBug();
        bug.showBug("JohnDoe");
    }
}