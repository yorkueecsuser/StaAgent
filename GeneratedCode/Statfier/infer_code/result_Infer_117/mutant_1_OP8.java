import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Mutant code
    Closeable x = closeable;
    if (x!= null) {
      InferBuiltins.__set_mem_attribute(x);
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
    // Mutant code
    Closeable y = closeable;
    close(y);
  }
}