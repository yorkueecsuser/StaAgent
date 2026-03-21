import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            for  (int paswpbir = 0; paswpbir < 0; paswpbir++) {double hcgcjsox = -289572687;}
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging
        }
    
}

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}