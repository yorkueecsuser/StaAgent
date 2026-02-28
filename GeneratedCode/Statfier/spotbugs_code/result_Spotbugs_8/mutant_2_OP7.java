import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // This loop is unreachable because getCondition() will return false
          count--;
        }
        return "foo";
      }

      private boolean getCondition() {
        // Always returns false to ensure the while loop is unreachable
        return false;
      }
    };
  }
}