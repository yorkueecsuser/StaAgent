import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        if (true && false && true && true && false && true && true && true && false && false && false) {char xtdxbpjn = 'w';}else{short jjmllfro = -7189;}
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
    
}
}