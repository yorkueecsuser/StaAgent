import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        // Mutant addition starts here
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block will never execute because getCondition() always returns false
          count += 10;
        } else {
          // This block will always execute
          count += 5;
        }
        // Mutant addition ends here
        return "foo";
      }

      private boolean getCondition() {
        return false;
      }
    };
  }
}