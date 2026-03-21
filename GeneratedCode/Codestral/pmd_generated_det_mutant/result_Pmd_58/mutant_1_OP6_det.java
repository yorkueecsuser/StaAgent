import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        for  (int crxqsxiy = 0; crxqsxiy < 0; crxqsxiy++) {byte qxkrfpkp = -116;}
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
    
}
}