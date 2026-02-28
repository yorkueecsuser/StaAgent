import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MapTest {

  public void keySet_linear(Map<String, Integer> map) {
    Iterator<String> iterator = map.keySet().iterator();
    do {
      if (!iterator.hasNext()) break;
      String name = iterator.next();
    } while (true);
  }

  public void entrySet_linear(Map<String, Integer> map) {
    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
    do {
      if (!iterator.hasNext()) break;
      Map.Entry<String, Integer> entry = iterator.next();
    } while (true);
  }

  public void values_linear(Map<String, Integer> map) {
    map.put("hi", 0);
    Iterator<Integer> iterator = map.values().iterator();
    do {
      if (!iterator.hasNext()) break;
      Integer name = iterator.next();
    } while (true);
  }

  public void putAll_linear(Map<String, Integer> map) {
    Map<String, Integer> newmap = new HashMap<>();
    newmap.putAll(map);
    Iterator<Integer> iterator = newmap.values().iterator();
    do {
      if (!iterator.hasNext()) break;
      Integer name = iterator.next();
    } while (true);
  }

  boolean containsNullValue_linear(HashMap<Integer, String> keyMap) {
    return keyMap.containsValue(null);
  }

  void iterate_over_map_elems_linear(Map<String, ArrayList<?>> map) {
    ArrayList list = map.get("key");
    if (list == null) {
      return;
    }
    Iterator<Object> iterator = list.iterator();
    do {
      if (!iterator.hasNext()) break;
      Object el = iterator.next();
    } while (true);
  }
}