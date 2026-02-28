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

  // Introduced a non-final variable to avoid compile-time constant issues
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      log.info("This is an unreachable statement.");
    }
  }
}