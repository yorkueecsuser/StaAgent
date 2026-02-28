import java.io.Closeable;

class InferCloseables {

  private InferCloseables() {}

  public static void close(Closeable closeable) {
    if (closeable!= null) {
      InferBuiltins.__set_mem_attribute(closeable);
    }
    // Mutant: Renaming 'closeable' to 'a'
    if (a!= null) {
      InferBuiltins.__set_mem_attribute(a);
    }
  }

  public static void closeQuietly(Closeable closeable) {
    close(closeable);
    // Mutant: Renaming 'closeable' to 'b'
    close(b);
  }
}