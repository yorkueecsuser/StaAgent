import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable if statement");
        }
        return "foo";
      }

      private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime and is always false
        return false;
      }
    };
  }
}