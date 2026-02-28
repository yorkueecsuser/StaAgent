import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Unreachable if statement mutation
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
    // Unreachable if statement mutation
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is another unreachable statement.");
    }
  }

  private static boolean getUnreachableCondition() {
    return false;
  }
}