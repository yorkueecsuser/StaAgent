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
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}