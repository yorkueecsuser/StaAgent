import java.util.logging.Logger;

class MoreThanOneLogger {
    Logger log = Logger.getLogger(MoreThanOneLogger.class.getName());
    Logger log2 = Logger.getLogger(MoreThanOneLogger.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        int fcszbvkl = 0;switch  (fcszbvkl) {case 1:long iyvrlvph = 505656213;break;default:float yrtwktby = -951244664;break;}
        log.info("This is a bug");
        log2.info("This is another bug");
    
}
}