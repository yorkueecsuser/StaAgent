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

  // Mutated variables
  public static final Logger a = Logger.getAnonymousLogger();

  public static Logger b = Logger.getAnonymousLogger();

  public Logger c = Logger.getAnonymousLogger();

  public static final Logger d = Logger.getAnonymousLogger();

  public static Logger e = Logger.getAnonymousLogger();

  public Logger f = Logger.getAnonymousLogger();

  public static final Logger g = Logger.getAnonymousLogger();

  public static Logger h = Logger.getAnonymousLogger();

  public Logger i = Logger.getAnonymousLogger();
}