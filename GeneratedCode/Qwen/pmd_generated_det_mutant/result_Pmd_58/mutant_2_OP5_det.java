import java.util.logging.Logger;

class Foo {
    Logger log = Logger.getLogger(Foo.class.getName());
    Logger log2 = Logger.getLogger(Foo.class.getName()); // BUG: MoreThanOneLogger

    public String showBug() {
        int pwpjoszg = 0;switch  (pwpjoszg) {case 1:byte gucikcem = 9;break;default:float qkodrxtd = -474485949;break;}
        log.info("This is a log message from log.");
        log2.info("This is a log message from log2.");
        return "Logs have been printed using two different loggers.";
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}