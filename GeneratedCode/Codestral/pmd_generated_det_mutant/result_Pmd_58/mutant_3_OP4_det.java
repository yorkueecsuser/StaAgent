import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");
        if (false && true && false && true && true && true && true && true && true && false && false) {byte cuzwzoec = 66;}else{short nmtcwlgd = 3795;}
        log2.info("This is a log from log2");
    
}
}