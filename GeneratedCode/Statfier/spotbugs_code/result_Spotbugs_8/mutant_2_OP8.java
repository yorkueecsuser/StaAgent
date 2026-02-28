import java.util.HashMap;
import java.util.Map;

class Ideas_2011_11_18 {

  Map<String, String> foo() {
    return new HashMap<String, String>() {
      int count;

      public String get(String arg) {
        count++;
        return "foo";
      }
    };
  }

  Map<String, String> bar() {
    return new HashMap<String, String>() {
      int xyz;

      public String get(String arg) {
        xyz++;
        return "bar";
      }
    };
  }
}