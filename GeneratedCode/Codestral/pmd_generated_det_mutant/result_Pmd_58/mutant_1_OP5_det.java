import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        int vlvwhmwl = 0;switch  (vlvwhmwl) {case 1:float zghudtxg = -538146515;break;default:long minbrhxt = -855185513;break;}
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
    
}
}