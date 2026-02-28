import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
        // Mutant: Duplicate the assignment statement (though there is no direct assignment here, we duplicate the condition check for demonstration)
        if (closeable!= null) {
        }
      }
    } catch (Exception ex) {
    }
  }
}