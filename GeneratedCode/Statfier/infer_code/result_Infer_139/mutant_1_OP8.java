import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MapTest {

  public void keySet_linear(Map<String, Integer> map) {
    for (String name : map.keySet()) {}
    // Mutant
    for (String x : map.keySet()) {}
  }

  public void entrySet_linear(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {}
    // Mutant
    for (Map.Entry<String, Integer> e : map.entrySet()) {}
  }

  public void values_linear(Map<String, Integer> map) {
    map.put("hi", 0);
    for (Integer name : map.values()) {}
    // Mutant
    for (Integer v : map.values()) {}
  }

  public void putAll_linear(Map<String, Integer> map) {
    Map<String, Integer> newmap = new HashMap<>();
    newmap.putAll(map);
    for (Integer name : newmap.values()) {}
    // Mutant
    for (Integer n : newmap.values()) {}
  }

  boolean containsNullValue_linear(HashMap<Integer, String> keyMap) {
    return keyMap.containsValue(null);
    // Mutant
    return keyMap.containsValue(n);
  }

  void iterate_over_map_elems_linear(Map<String, ArrayList<?>> map) {
    ArrayList list = map.get("key");
    if (list == null) {
      return;
    }
    for (Object el : list) {}
    // Mutant
    for (Object o : list) {}
  }
}