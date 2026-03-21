import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        if (true && false && false && true && true && true && false && true && false && false && false) {char fyayjvnf = 'v';}
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging
        }
    
}

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}