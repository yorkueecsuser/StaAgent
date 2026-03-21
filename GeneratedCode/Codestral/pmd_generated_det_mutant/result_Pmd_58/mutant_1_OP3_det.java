import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");
        if (false && false && false && true && true && false && true && false && true && false && false) {double neefisgk = 976946195;}
        log2.info("This is a log from log2");
    
}
}