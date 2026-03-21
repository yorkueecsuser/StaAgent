import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        if (true && false && true && false && true && false && true && false && true && false && false) {char gemakvbj = 'i';}else{short zztyhdzd = -9158;}
        int x = 5;
        int y = 10;
        logger.info("x = %d, y = %d", x, y);
    
}
}