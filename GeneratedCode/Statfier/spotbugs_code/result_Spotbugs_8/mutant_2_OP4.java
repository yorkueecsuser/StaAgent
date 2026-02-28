import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block will never execute because getCondition() always returns false
          System.out.println("This is an unreachable block");
        } else {
          // This block will also never execute because there's no other path to reach here
          System.out.println("This is another unreachable block");
        }
        return "foo";
      }

      private boolean getCondition() {
        // Always return false to ensure the if-else block is unreachable
        return false;
      }
    };
  }
}