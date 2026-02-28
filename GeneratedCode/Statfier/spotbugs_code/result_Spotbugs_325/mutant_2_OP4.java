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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      log.info("This is a reachable statement.");
    } else {
      // Unreachable if-else branch
      log.info("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return true; // This ensures the if branch is taken and else is unreachable
  }
}