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
    return d;
  }

  // Mutant: Renamed 'd' to 'x'
  int list_contains_hoist_mutant(List<String> list, String s) {
    int x = 0;
    for (int i = 0; i < 10; i++) {
      if (list.contains(s.substring(0, 1))) {
        x++;
      }
    }
    return x;
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
  }

  // Mutant: Renamed 'o' to 'q'
  void deserialize_hoist_mutant(
      final JsonDeserializer<?> specDeserializer,
      final JsonParser p,
      final DeserializationContext ctx)
      throws IOException {
    int d = 0;
    Object q;
    for (int i = 0; i < 10; i++) {
      q = specDeserializer.deserialize(p, ctx);
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

  // Mutant: Renamed 'el' to'm'
  boolean contains_pure_FN_mutant(Integer i, ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      Integer m = listIterator.next();
      if (i.equals(m)) {
        return true;
      }
    }
    return false;
  }

  void call_contains_pure_hoist_FN(int b, ArrayList<Integer> list) {
    for (int i = 0; i < b; i++) {
      contains_pure_FN(b, list);
    }
  }

  // Mutant: Renamed 'b' to 'n'
  void call_contains_pure_hoist_FN_mutant(int n, ArrayList<Integer> list) {
    for (int i = 0; i < n; i++) {
      contains_pure_FN(n, list);
    }
  }
}