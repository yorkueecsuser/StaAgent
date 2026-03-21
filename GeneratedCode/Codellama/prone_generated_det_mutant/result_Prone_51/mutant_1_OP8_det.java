import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        int fvovqcja = 5;
        int zbldbtvz = 10;
        logger.info("fvovqcja = %d, zbldbtvz = %d", fvovqcja, zbldbtvz);
    }
}