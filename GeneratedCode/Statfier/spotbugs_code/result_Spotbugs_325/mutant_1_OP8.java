import java.util.logging.Logger;

class Bug2843625 {
  public static final Logger log = Logger.getAnonymousLogger();
  public static final Logger x = Logger.getAnonymousLogger(); // Mutant: Renamed log to x

  public static Logger log2 = Logger.getAnonymousLogger();
  public static Logger y = Logger.getAnonymousLogger(); // Mutant: Renamed log2 to y

  public Logger log3 = Logger.getAnonymousLogger();
  public Logger z = Logger.getAnonymousLogger(); // Mutant: Renamed log3 to z

  public static final Logger Log = Logger.getAnonymousLogger();
  public static final Logger a = Logger.getAnonymousLogger(); // Mutant: Renamed Log to a

  public static Logger Log2 = Logger.getAnonymousLogger();
  public static Logger b = Logger.getAnonymousLogger(); // Mutant: Renamed Log2 to b

  public Logger Log3 = Logger.getAnonymousLogger();
  public Logger c = Logger.getAnonymousLogger(); // Mutant: Renamed Log3 to c

  public static final Logger LOG = Logger.getAnonymousLogger();
  public static final Logger d = Logger.getAnonymousLogger(); // Mutant: Renamed LOG to d

  public static Logger LOG2 = Logger.getAnonymousLogger();
  public static Logger e = Logger.getAnonymousLogger(); // Mutant: Renamed LOG2 to e

  public Logger LOG3 = Logger.getAnonymousLogger();
  public Logger f = Logger.getAnonymousLogger(); // Mutant: Renamed LOG3 to f

  public enum ApplicationType {
    Data,
    data,
    DATA
  }
}