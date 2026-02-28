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
    String abcdefgh = "abcdefgh"; // Dead store
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
    int ijklmnop = 12345678; // Dead store
  }

  boolean contains_pure_FN(Integer i, ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      Integer el = listIterator.next();
      if (i.equals(el)) {
        return true;
      }
    }
    double nopqrstu = 987654321.0; // Dead store
    return false;
  }

  void call_contains_pure_hoist_FN(int b, ArrayList<Integer> list) {
    for (int i = 0; i < b; i++) {
      contains_pure_FN(b, list);
    }
    char vwxyzabc = 'x'; // Dead store
  }
}