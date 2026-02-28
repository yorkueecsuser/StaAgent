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

  // Mutant for list_contains_hoist
  int list_contains_hoist_mutant(List<String> x, String y) {
    int a = 0;
    for (int j = 0; j < 10; j++) {
      if (x.contains(y.substring(0, 1))) {
        a++;
      }
    }
    return a;
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

  // Mutant for deserialize_hoist
  void deserialize_hoist_mutant(
      final JsonDeserializer<?> z,
      final JsonParser q,
      final DeserializationContext r)
      throws IOException {
    int e = 0;
    Object n;
    for (int m = 0; m < 10; m++) {
      n = z.deserialize(q, r);
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

  // Mutant for contains_pure_FN
  boolean contains_pure_FN_mutant(Integer j, ArrayList<Integer> k) {
    Iterator<Integer> iterator = k.iterator();
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      if (j.equals(element)) {
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

  // Mutant for call_contains_pure_hoist_FN
  void call_contains_pure_hoist_FN_mutant(int c, ArrayList<Integer> l) {
    for (int f = 0; f < c; f++) {
      contains_pure_FN(c, l);
    }
  }
}