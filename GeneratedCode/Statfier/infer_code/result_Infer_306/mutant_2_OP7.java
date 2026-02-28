import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.*;

class HoistModeled {

  int list_contains_hoist(List<String> list, String s) {
    int d = 0;
    for (int i = 0; i < 10; i++) {
      if (list.contains(s.substring(0, 1))) {
        d++;
      }
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      d--;
    }
    return d;
  }

  void deserialize_hoist(
      final JsonDeserializer<?> specDeserializer,
      final JsonParser p,
      final DeserializationContext ctx)
      throws IOException {
    int d = 0;
    Object o;
    for (int i = 0; i < 10; i++) {
      o = specDeserializer.deserialize(p, ctx);
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      d++;
    }
  }

  boolean contains_pure_FN(Integer i, ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      Integer el = listIterator.next();
      if (i.equals(el)) {
        return true;
      }
    }
    return false;
  }

  void call_contains_pure_hoist_FN(int b, ArrayList<Integer> list) {
    for (int i = 0; i < b; i++) {
      contains_pure_FN(b, list);
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      b--;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}