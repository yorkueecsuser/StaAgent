import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DontCatchUncheckedExceptionTest {

  // Suppress NPE

  @ExpectWarning("DCN_NULLPOINTER_EXCEPTION")
  public int doNotCatchNullpointerException(String s) {
    int len = -1;
    try {
      len = s.length();
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
    private final Logger x; // Renamed 'log' to 'x'

    public Service() {
      x = null;
    }

    public Service(Logger l) {
      x = l;
    }

    @ExpectWarning("DCN_NULLPOINTER_EXCEPTION")
    public void serve() {
      try {
        /*...*/
        x.print("Serving request...");
      } catch (NullPointerException e) {
      }
    }
  }
}