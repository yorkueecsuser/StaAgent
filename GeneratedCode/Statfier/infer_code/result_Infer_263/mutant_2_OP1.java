import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
        // Dead store mutation
        String qzjxvbnr = "unusedVariable";
      }
    } catch (Exception ex) {
    }
  }
}