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
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      len += 1;
    } else {
      // This is an unreachable block due to the condition always being false
      len -= 1;
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
      boolean condition = getCondition();
      if (condition) {
        // This is a reachable block
        System.out.println("This is a reachable block");
      } else {
        // This is an unreachable block due to the condition always being false
        System.out.println("This is an unreachable block");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically
  }
}