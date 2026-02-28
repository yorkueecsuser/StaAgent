import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        // Introduced an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block will never execute because getCondition() returns false
          count--;
          return "bar";
        } else {
          // This block will also never execute because getCondition() returns false
          return "baz";
        }
        return "foo";
      }

      private boolean getCondition() {
        // Always returns false, making the if-else block unreachable
        return false;
      }
    };
  }
}