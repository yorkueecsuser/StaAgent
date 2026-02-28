import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be reached
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}