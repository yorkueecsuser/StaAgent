import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");
        int uyhbaqvz = 0;switch  (uyhbaqvz) {case 1:long ujfvxefc = -70941455;break;default:byte sxcppexe = -71;break;}
        log2.info("This is a log from log2");
    
}
}