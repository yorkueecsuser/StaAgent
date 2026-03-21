import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger logger = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public static void main(String[] args) {
        int qiqqijxd = 5;
        int cajeabqz = 10;
        logger.info("qiqqijxd = %d, cajeabqz = %d", qiqqijxd, cajeabqz);
    }
}