import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
    } catch (Exception ex) {
    }
    
    // Mutated code
    try {
      if (closeable!= null) {
        closeable.close();
      }
    } catch (Exception a) {
    }
  }
}