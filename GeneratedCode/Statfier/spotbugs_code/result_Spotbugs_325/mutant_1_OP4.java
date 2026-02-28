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

  // Added mutant code with an unreachable if-else statement
  public void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      log.info("This is reachable code.");
    } else {
      // This is an unreachable if-else branch
      log.severe("This is unreachable code due to the condition always being true.");
    }
  }

  private boolean getCondition() {
    return true; // Ensure the condition is always true to make the else branch unreachable
  }
}