import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");
        int mkmadjmd = 0;switch  (mkmadjmd) {case 1:float gtggcxjp = 487259911;break;default:double lwoivtef = 958236377;break;}
        log2.info("This is a log from log2");
    
}
}