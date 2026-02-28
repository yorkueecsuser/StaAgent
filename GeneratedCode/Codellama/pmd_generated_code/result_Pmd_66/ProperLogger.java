import java.util.logging.Logger;

class ProperLogger {
    private static final Logger log = Logger.getLogger("MyLogger");

    public static void main(String[] args) {
        log.info("Hello, World!");
    }
}