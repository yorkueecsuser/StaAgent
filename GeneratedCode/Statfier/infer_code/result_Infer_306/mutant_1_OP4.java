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
      // Mutant: Unreachable if-else statement
      boolean shouldRun = falseCondition();
      if (shouldRun) {
        d += 10; // This block is unreachable
      } else {
        d += 5; // This block is also unreachable
      }
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
      // Mutant: Unreachable if-else statement
      boolean shouldRun = falseCondition();
      if (shouldRun) {
        d += 10; // This block is unreachable
      } else {
        d += 5; // This block is also unreachable
      }
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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      return true; // This block is unreachable
    } else {
      return false; // This block is also unreachable
    }
    return false;
  }

  void call_contains_pure_hoist_FN(int b, ArrayList<Integer> list) {
    for (int i = 0; i < b; i++) {
      contains_pure_FN(b, list);
      // Mutant: Unreachable if-else statement
      boolean shouldRun = falseCondition();
      if (shouldRun) {
        System.out.println("Unreachable"); // This block is unreachable
      } else {
        System.out.println("Also unreachable"); // This block is also unreachable
      }
    }
  }

  // Helper method to provide a dynamic false condition
  private boolean falseCondition() {
    return false;
  }
}