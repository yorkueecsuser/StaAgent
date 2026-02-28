import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable block");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is another unreachable block");
      }
    } catch (Exception ex) {
    }
  }

  private static boolean getCondition() {
    return false;
  }
}