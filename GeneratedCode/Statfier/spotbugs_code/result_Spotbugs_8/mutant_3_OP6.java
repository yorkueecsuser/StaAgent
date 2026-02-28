import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        return "foo";

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is never set to true
        }
      }

      private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
      }
    };
  }
}