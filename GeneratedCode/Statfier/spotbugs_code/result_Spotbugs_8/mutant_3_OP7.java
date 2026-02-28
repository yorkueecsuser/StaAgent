import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // This loop is unreachable because getCondition() will always return false
        }
        return "foo";
      }

      private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
      }
    };
  }
}