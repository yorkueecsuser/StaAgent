import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        if (false && true && false && false && true && false && false && true && true && false && false) {boolean eabrqgzp = true;}else{float aqzijgqi = 269958322;}
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
    
}
}