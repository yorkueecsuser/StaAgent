import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
    } catch (Exception ex) {
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because getCondition() always returns false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to satisfy switch statement requirements
        break;
    }
  }

  private static boolean getCondition() {
    // Always return false to ensure the switch statement is unreachable
    return false;
  }
}