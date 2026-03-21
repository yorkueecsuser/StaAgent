import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        for  (int kcoxyzje = 0; kcoxyzje < 0; kcoxyzje++) {String lxrvnour = "qaxpoqkb";}
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
    
}
}