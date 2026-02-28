import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MapTest {

  public void keySet_linear(Map<String, Integer> map) {
    for (String name : map.keySet()) {}
    // Mutant: Renaming 'name' to 'a'
    for (String a : map.keySet()) {}
  }

  public void entrySet_linear(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {}
    // Mutant: Renaming 'entry' to 'b'
    for (Map.Entry<String, Integer> b : map.entrySet()) {}
  }

  public void values_linear(Map<String, Integer> map) {
    map.put("hi", 0);
    for (Integer name : map.values()) {}
    // Mutant: Renaming 'name' to 'c'
    for (Integer c : map.values()) {}
  }

  public void putAll_linear(Map<String, Integer> map) {
    Map<String, Integer> newmap = new HashMap<>();
    newmap.putAll(map);
    for (Integer name : newmap.values()) {}
    // Mutant: Renaming 'name' to 'd'
    for (Integer d : newmap.values()) {}
  }

  boolean containsNullValue_linear(HashMap<Integer, String> keyMap) {
    return keyMap.containsValue(null);
    // Mutant: Renaming 'keyMap' to 'e' (not renaming the parameter as it's part of the method signature)
    boolean e = keyMap.containsValue(null);
    return e;
  }

  void iterate_over_map_elems_linear(Map<String, ArrayList<?>> map) {
    ArrayList list = map.get("key");
    if (list == null) {
      return;
    }
    for (Object el : list) {}
    // Mutant: Renaming 'list' to 'f'
    ArrayList f = map.get("key");
    if (f == null) {
      return;
    }
    for (Object g : f) {}
  }
}