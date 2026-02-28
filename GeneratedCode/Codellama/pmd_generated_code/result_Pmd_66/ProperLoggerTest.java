import java.util.logging.Logger;

class ProperLogger {
    private static final Logger log = Logger.getLogger("MyLogger");

    public static void main(String[] args) {
        log.info("Hello, World!");
    }

    public void showBug() {
        // Add code to trigger the bug here
    }
}