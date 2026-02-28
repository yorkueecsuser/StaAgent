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
      if (map.containsKey(name)) {
        return name;
      }
      pos = name.indexOf('.');
      name = name.substring(pos + 1);
      // ^^^ "Dead store to name" here
      
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case");
          break;
      }
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

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}