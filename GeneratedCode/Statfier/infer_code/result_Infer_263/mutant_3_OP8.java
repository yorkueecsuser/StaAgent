import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
    } catch (Exception ex) {
    }
    
    // Mutant code with renamed variable
    try {
      if (closeable!= null) {
        Closeable a = closeable;
        a.close();
      }
    } catch (Exception b) {
    }
  }
}