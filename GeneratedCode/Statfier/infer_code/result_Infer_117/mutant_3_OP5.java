import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() does not return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
  }

  private static boolean getCondition() {
    // Always returns false to ensure the switch case is unreachable
    return false;
  }
}