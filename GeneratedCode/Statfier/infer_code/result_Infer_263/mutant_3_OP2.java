import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
        closeable = closeable; // Mutant: duplicated assignment statement
      }
    } catch (Exception ex) {
    }
  }
}