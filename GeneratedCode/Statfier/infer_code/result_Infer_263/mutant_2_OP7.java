import java.io.Closeable;

class Utils {

  public static void closeQuietly(Closeable closeable) {
    try {
      if (closeable!= null) {
        closeable.close();
      }
    } catch (Exception ex) {
    }

    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}