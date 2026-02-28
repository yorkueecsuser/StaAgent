import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * We found a problem with the new OpenJDK that everyone is now using to compile and run java code.
 * In particular, the java.util.logging.Logger behavior has changed. Instead of using strong
 * references, it now uses weak references internally. That's a reasonable change, but unfortunately
 * some code relies on the old behavior - when changing logger configuration, it simply drops the
 * logger reference. That means that the garbage collector is free to reclaim that memory, which
 * means that the logger configuration is lost.
 */
class Ideas_2009_05_06 {
  /**
   * The logger reference is lost at the end of the method (it doesn't escape the method), so if you
   * have a garbage collection cycle just after the call to initLogging, the logger configuration is
   * lost (because Logger only keeps weak references).
   */
  @ExpectWarning("LG_LOST_LOGGER_DUE_TO_WEAK_REFERENCE")
  public static void initLogging() throws SecurityException, IOException {
    Logger logger = Logger.getLogger("edu.umd.cs.findbugs");
    logger.addHandler(new FileHandler()); // call to change logger
    // configuration
    logger.setUseParentHandlers(false); // another call to change logger
    // configuration
    logger.setLevel(Level.FINER);
    logger.setFilter(
        new Filter() {

          @Override
          public boolean isLoggable(LogRecord arg0) {
            return true;
          }
        });

    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      logger.info("This is an unreachable log message.");
    }
  }

  static Object foo1;

  static List<Logger> foo2 = new ArrayList<Logger>();

  public static void falsePositive1() {
    Logger logger = Logger.getLogger("edu.umd.cs.findbugs");
    logger.setLevel(Level.FINER);
    foo1 = logger;

    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      logger.info("This is an unreachable log message.");
    }
  }

  public static void falsePositive2() {
    Logger logger = Logger.getLogger("edu.umd.cs.findbugs");
    logger.setLevel(Level.FINER);
    foo2.add(logger);

    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      logger.info("This is an unreachable log message.");
    }
  }

  public static void main(String[] args) throws Exception {
    initLogging(); // adds a file handler to the logger
    System.gc(); // logger configuration lost
    Logger.getLogger("com.google.gse").info("Some message"); // this isn't
    // logged to
    // the file as
    // expected

    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      Logger.getLogger("com.google.gse").info("This is an unreachable log message.");
    }
  }

  // Method to provide a dynamic condition for the if statement
  private static boolean getCondition() {
    return false;
  }
}