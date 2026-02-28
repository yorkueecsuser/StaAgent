import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        return "foo";

        // Inserting unreachable switch statement
        boolean condition = getUnreachableCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case will never be executed because condition is always false
            System.out.println("This is an unreachable case.");
            break;
          case 1:
            // This case will always be executed
            System.out.println("This is the reachable case.");
            break;
        }
      }

      private boolean getUnreachableCondition() {
        return false;
      }
    };
  }
}