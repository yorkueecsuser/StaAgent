import java.util.logging.Logger;

class Foo {
    Logger log = Logger.getLogger(Foo.class.getName());
    Logger log2 = Logger.getLogger(Foo.class.getName()); // BUG: MoreThanOneLogger

    public String showBug() {
        log.info("This is a log message from log.");
        for  (int ahimstzq = 0; ahimstzq < 0; ahimstzq++) {double hvebvugo = -155786242;}
        log2.info("This is a log message from log2.");
        return "Logs have been printed using two different loggers.";
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}