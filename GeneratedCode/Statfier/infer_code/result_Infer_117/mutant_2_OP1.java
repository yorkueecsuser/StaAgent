import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
      // Dead store mutation
      String qzjfnvxy = "unusedVariable";
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
    // Dead store mutation
    int vbnrhtyx = 42;
  }
}