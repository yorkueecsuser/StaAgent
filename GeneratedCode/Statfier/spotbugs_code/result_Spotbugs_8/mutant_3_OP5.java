import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        return "foo";

        // Introduced unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
          case true:
            System.out.println("This will never be printed");
            break;
        }
      }

      private boolean getAlwaysFalse() {
        return false;
      }
    };
  }
}