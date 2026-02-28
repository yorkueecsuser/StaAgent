import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
      } else {
        // This block will also never execute because shouldRun is always false
      }
      // Mutant code end
    } catch (Exception ex) {
    }
  }

  private static boolean getCondition() {
    return false;
  }
}