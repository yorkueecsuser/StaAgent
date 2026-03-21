import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        int fojziobt = 0;switch  (fojziobt) {case 1:boolean cfqkengg = false;break;default:short hvgatyny = 2346;break;}
        log.info("This is a bug");
        log2.info("This is another bug");
    
}
}