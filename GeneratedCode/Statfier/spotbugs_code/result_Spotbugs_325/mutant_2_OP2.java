import java.util.logging.Logger;

class Bug2843625 {
  public static final Logger log = Logger.getAnonymousLogger();
  public static final Logger log_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public static Logger log2 = Logger.getAnonymousLogger();
  public static Logger log2_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public Logger log3 = Logger.getAnonymousLogger();
  public Logger log3_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public static final Logger Log = Logger.getAnonymousLogger();
  public static final Logger Log_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public static Logger Log2 = Logger.getAnonymousLogger();
  public static Logger Log2_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public Logger Log3 = Logger.getAnonymousLogger();
  public Logger Log3_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public static final Logger LOG = Logger.getAnonymousLogger();
  public static final Logger LOG_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public static Logger LOG2 = Logger.getAnonymousLogger();
  public static Logger LOG2_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public Logger LOG3 = Logger.getAnonymousLogger();
  public Logger LOG3_duplicate = Logger.getAnonymousLogger(); // Duplicate

  public enum ApplicationType {
    Data,
    data,
    DATA
  }
}