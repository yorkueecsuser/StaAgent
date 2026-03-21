import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log.info("This is a bug");
        int fymwltuc = 0;switch  (fymwltuc) {case 1:short fuvwfnyk = -5994;break;default:double hdfmmsib = -414845183;break;}
        log2.info("This is another bug");
    
}
}