import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");
        boolean kqjeygjo = false;while (kqjeygjo && true && true && true && false && false && true && true && true && true && false && false) {short ofnhsuos = -2831;}
        log2.info("This is a log from log2");
    
}
}