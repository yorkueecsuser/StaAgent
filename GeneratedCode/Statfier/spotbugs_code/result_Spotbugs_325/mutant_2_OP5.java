import java.util.logging.Logger;

class Bug2843625 {
  public static final Logger log = Logger.getAnonymousLogger();

  public static Logger log2 = Logger.getAnonymousLogger();

  public Logger log3 = Logger.getAnonymousLogger();

  public static final Logger Log = Logger.getAnonymousLogger();

  public static Logger Log2 = Logger.getAnonymousLogger();

  public Logger Log3 = Logger.getAnonymousLogger();

  public static final Logger LOG = Logger.getAnonymousLogger();

  public static Logger LOG2 = Logger.getAnonymousLogger();

  public Logger LOG3 = Logger.getAnonymousLogger();

  public enum ApplicationType {
    Data,
    data,
    DATA
  }

  // Added mutant code
  public void someMethod() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition? 0 : 1 will always be 1
        log.info("This is an unreachable case.");
        break;
      case 1:
        // This is the reachable case
        log.info("This is the reachable case.");
        break;
    }
  }

  private boolean getCondition() {
    // This method returns a constant false, but it is not a compile-time constant
    return false;
  }
}