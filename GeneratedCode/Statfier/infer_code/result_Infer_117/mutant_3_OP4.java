import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never be executed because the if condition is always false
      System.out.println("This is an unreachable else block");
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
  }

  // Method to return a constant false value
  private static boolean getCondition() {
    return false;
  }
}