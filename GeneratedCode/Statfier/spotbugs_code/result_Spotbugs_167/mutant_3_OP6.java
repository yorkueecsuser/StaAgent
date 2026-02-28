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
      
      // Inserting unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    }
  }

  private boolean getConditionForLoop() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}