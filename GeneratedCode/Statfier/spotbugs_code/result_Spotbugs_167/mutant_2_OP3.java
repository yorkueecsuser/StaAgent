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

    // Inserting unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}