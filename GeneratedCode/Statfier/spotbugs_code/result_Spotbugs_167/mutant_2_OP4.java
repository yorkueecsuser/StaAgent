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

    // Mutant code added here
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code to ensure the else block is reachable
      System.out.println("This is the reachable alternative block");
    }
  }

  private boolean getUnreachableCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}