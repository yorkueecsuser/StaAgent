import java.util.logging.Logger;

class FloggerLogVarargsBug {
    private static final Logger LOGGER = Logger.getLogger(FloggerLogVarargsBug.class.getName());

    public void showBug(String msg, int num) {
        for  (int idabfwvf = 0; idabfwvf < 0; idabfwvf++) {byte vnkaukfe = 91;}
        LOGGER.info(msg + num); // BUG: FloggerLogVarargs
        // This line concatenates a string with an integer, which can cause unexpected results.
        // Instead, logVarargs should be used to pass the format string and arguments separately.
    
}

    public static void main(String[] args) {
        FloggerLogVarargsBug bug = new FloggerLogVarargsBug();
        bug.showBug("The number is: ", 5);
    }
}