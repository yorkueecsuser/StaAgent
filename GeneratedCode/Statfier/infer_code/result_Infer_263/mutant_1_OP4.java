import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
      // Mutant code starts here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is intended to be unreachable
      } else {
        // Alternative code that is also unreachable due to the nature of the condition
      }
    } catch (Exception ex) {
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}