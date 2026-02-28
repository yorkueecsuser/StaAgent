import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
    }
  }

  private static boolean getCondition() {
    return false;
  }
}