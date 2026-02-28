import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashMap;

class Bug3572704 {
  public static HashMap<String, String> map = new HashMap<String, String>();

  @ExpectWarning("DLS_DEAD_LOCAL_STORE")
  public static String test(String name) {
    int pos = 0;
    while (pos >= 0 &&!name.isEmpty())
      ;
    {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          pos = -1; // This line is unreachable
        } else {
          pos = 0; // This line is also unreachable
        }
      }
      if (map.containsKey(name)) {
        return name;
      }
      pos = name.indexOf('.');
      name = name.substring(pos + 1);
      // ^^^ "Dead store to name" here
    }
    return null;
  }

  @NoWarning("DLS_DEAD_LOCAL_STORE")
  public static String test2(String name) {
    int pos = 0;
    while (pos >= 0 &&!name.isEmpty()) {
      if (map.containsKey(name)) {
        return name;
      }
      pos = name.indexOf('.');
      name = name.substring(pos + 1);
      // ^^^ "Dead store to name" here
    }
    return null;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }

  private static boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}