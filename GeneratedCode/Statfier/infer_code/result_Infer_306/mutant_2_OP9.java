import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.*;

class HoistModeled {

  int list_contains_hoist(List<String> list, String s) {
    int d = 0;
    int i = 0;
    do {
      if (list.contains(s.substring(0, 1))) {
        d++;
      }
      i++;
    } while (i < 10);
    return d;
  }

  void deserialize_hoist(
      final JsonDeserializer<?> specDeserializer,
      final JsonParser p,
      final DeserializationContext ctx)
      throws IOException {
    int d = 0;
    Object o;
    int i = 0;
    do {
      o = specDeserializer.deserialize(p, ctx);
      i++;
    } while (i < 10);
  }

  boolean contains_pure_FN(Integer i, ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    do {
      if (listIterator.hasNext()) {
        Integer el = listIterator.next();
        if (i.equals(el)) {
          return true;
        }
      } else {
        break;
      }
    } while (true);
    return false;
  }

  void call_contains_pure_hoist_FN(int b, ArrayList<Integer> list) {
    int i = 0;
    do {
      contains_pure_FN(b, list);
      i++;
    } while (i < b);
  }
}