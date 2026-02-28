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
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("This is an unreachable case");
            break;
          case 1:
            // This case is always executed
            System.out.println("This is the reachable case");
            break;
        }
      }

      private boolean getCondition() {
        // This method always returns false, making the first case of the switch unreachable
        return false;
      }
    };
  }
}