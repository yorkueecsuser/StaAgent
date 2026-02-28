import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Mutant code: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will also never be executed because getCondition() always returns false
      System.out.println("This is an unreachable else block.");
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
  }

  // Method to provide a dynamic but always false condition
  private static boolean getCondition() {
    return false;
  }
}