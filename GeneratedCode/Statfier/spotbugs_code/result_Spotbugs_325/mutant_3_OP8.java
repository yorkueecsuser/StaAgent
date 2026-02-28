import java.util.logging.Logger;

class Bug2843625 {
  public static final Logger log = Logger.getAnonymousLogger();
  public static final Logger a = Logger.getAnonymousLogger(); // Mutant: Renamed log to a

  public static Logger log2 = Logger.getAnonymousLogger();
  public static Logger b = Logger.getAnonymousLogger(); // Mutant: Renamed log2 to b

  public Logger log3 = Logger.getAnonymousLogger();
  public Logger c = Logger.getAnonymousLogger(); // Mutant: Renamed log3 to c

  public static final Logger Log = Logger.getAnonymousLogger();
  public static final Logger d = Logger.getAnonymousLogger(); // Mutant: Renamed Log to d

  public static Logger Log2 = Logger.getAnonymousLogger();
  public static Logger e = Logger.getAnonymousLogger(); // Mutant: Renamed Log2 to e

  public Logger Log3 = Logger.getAnonymousLogger();
  public Logger f = Logger.getAnonymousLogger(); // Mutant: Renamed Log3 to f

  public static final Logger LOG = Logger.getAnonymousLogger();
  public static final Logger g = Logger.getAnonymousLogger(); // Mutant: Renamed LOG to g

  public static Logger LOG2 = Logger.getAnonymousLogger();
  public static Logger h = Logger.getAnonymousLogger(); // Mutant: Renamed LOG2 to h

  public Logger LOG3 = Logger.getAnonymousLogger();
  public Logger i = Logger.getAnonymousLogger(); // Mutant: Renamed LOG3 to i

  public enum ApplicationType {
    Data,
    data,
    DATA
  }
}