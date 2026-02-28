import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
      // Dead Store Mutation
      String jkqzltfn = "unusedVariable";
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
    // Dead Store Mutation
    int wvbnrhty = 42;
  }
}