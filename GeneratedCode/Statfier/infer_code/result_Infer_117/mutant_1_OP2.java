import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
      InferBuiltins.__set_mem_attribute(closeable); // Duplicate assignment statement
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
  }
}