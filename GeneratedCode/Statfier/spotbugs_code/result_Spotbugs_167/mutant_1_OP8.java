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

    // Mutant code
    String b = null;
    if (container!= null) b = getLogger();
    if (b!= null)
      b.log(Level.SEVERE, "StandardWrapperValve[" + container.toLowerCase() + "]: " + message);
    else {
      String c = null;
      if (container!= null) c = container.toLowerCase();
      System.out.println("StandardWrapperValve[" + c + "]: " + message);
    }
  }
}