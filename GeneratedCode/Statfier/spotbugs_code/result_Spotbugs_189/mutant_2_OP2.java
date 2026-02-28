import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DontCatchUncheckedExceptionTest {

  // Suppress NPE

  @ExpectWarning("DCN_NULLPOINTER_EXCEPTION")
  public int doNotCatchNullpointerException(String s) {
    int len = -1;
    try {
      len = s.length();
      len = -1; // Mutant: Duplicate assignment
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
    }
  }

  private class ConsoleLogger implements Logger {
    public void print(String msg) {
      /*...*/
    }
  }

  private class Service {
    private final Logger log;

    public Service() {
      log = null;
      log = null; // Mutant: Duplicate assignment
    }

    public Service(Logger l) {
      log = l;
    }

    @ExpectWarning("DCN_NULLPOINTER_EXCEPTION")
    public void serve() {
      try {
        /*...*/
        log.print("Serving request...");
      } catch (NullPointerException e) {
      }
    }
  }
}