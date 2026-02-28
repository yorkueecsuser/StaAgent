import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
      // Inserted unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable statement.");
      }
    } catch (Exception ex) {
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}