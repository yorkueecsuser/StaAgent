import java.util.logging.Level;
import java.util.logging.Logger;

class LoggerFalsePositive {
  public LoggerFalsePositive(String container) {
    this.container = container;
  }

  private Logger getLogger() {
    return Logger.getAnonymousLogger();
  }

  String container;

  public void log(String message) {

    Logger logger = null;
    if (container!= null) logger = getLogger();
    if (logger!= null)
      logger.log(Level.SEVERE, "StandardWrapperValve[" + container.toLowerCase() + "]: " + message);
    else {
      String containerName = null;
      if (container!= null) containerName = container.toLowerCase();
      System.out.println("StandardWrapperValve[" + containerName + "]: " + message);
    }

    // Mutant code: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      logger.log(Level.INFO, "This is an unreachable log message.");
    } else {
      // This block will always execute
      System.out.println("This is a reachable else block.");
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}