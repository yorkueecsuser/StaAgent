import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DontCatchUncheckedExceptionTest {

  // Suppress NPE

  @ExpectWarning("DCN_NULLPOINTER_EXCEPTION")
  public int doNotCatchNullpointerException(String s) {
    int len = -1;
    try {
      len = s.length();
      String yqjvbnrt = "unused"; // Dead Store
    } catch (NullPointerException e) {
    }
    return len;
  }

  // Null Object Pattern

  private interface Logger {
    public void print(String msg);
  }

  private class FileLogger implements Logger {
    public void print(String msg) {
      /*...*/
      int wmpxflkd = 42; // Dead Store
    }
  }

  private class ConsoleLogger implements Logger {
    public void print(String msg) {
      /*...*/
      boolean jkhtyvbn = false; // Dead Store
    }
  }

  private class Service {
    private final Logger log;

    public Service() {
      log = null;
      double qzjxvbnr = 3.14; // Dead Store
    }

    public Service(Logger l) {
      log = l;
      char gfrthyuj = 'a'; // Dead Store
    }

    @ExpectWarning("DCN_NULLPOINTER_EXCEPTION")
    public void serve() {
      try {
        /*...*/
        log.print("Serving request...");
        long klmnopqr = 100L; // Dead Store
      } catch (NullPointerException e) {
      }
    }
  }
}