import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (true && false && true && false && true && true && false && true && false && true && false) {char gggxebvo = 'l';}else{long vpsoxpoe = 773583179;}
        logger.info("x = %d, y = %d", x, y);
    
}
}