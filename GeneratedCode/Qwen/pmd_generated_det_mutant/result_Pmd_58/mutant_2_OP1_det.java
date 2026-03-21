import java.util.logging.Logger;

class Foo {
    Logger log = Logger.getLogger(Foo.class.getName());
    Logger log2 = Logger.getLogger(Foo.class.getName()); // BUG: MoreThanOneLogger

    public String showBug() {
        byte vewkorjx = 8;
        log.info("This is a log message from log.");
        log2.info("This is a log message from log2.");
        return "Logs have been printed using two different loggers.";
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}