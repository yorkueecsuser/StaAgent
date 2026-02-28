import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MapTest {

  public void keySet_linear(Map<String, Integer> map) {
    for (String name : map.keySet()) {}
    String abcdefgh = "unusedVariable"; // Dead Store
  }

  public void entrySet_linear(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {}
    int hijklmno = 42; // Dead Store
  }

  public void values_linear(Map<String, Integer> map) {
    map.put("hi", 0);
    for (Integer name : map.values()) {}
    double pqrstuvw = 3.14; // Dead Store
  }

  public void putAll_linear(Map<String, Integer> map) {
    Map<String, Integer> newmap = new HashMap<>();
    newmap.putAll(map);
    for (Integer name : newmap.values()) {}
    char xyzabcde = 'x'; // Dead Store
  }

  boolean containsNullValue_linear(HashMap<Integer, String> keyMap) {
    return keyMap.containsValue(null);
    boolean fghijklm = true; // Dead Store
  }

  void iterate_over_map_elems_linear(Map<String, ArrayList<?>> map) {
    ArrayList list = map.get("key");
    if (list == null) {
      return;
    }
    for (Object el : list) {}
    long nopqrstu = 123456789L; // Dead Store
  }
}