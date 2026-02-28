import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MapTest {

  public void keySet_linear(Map<String, Integer> map) {
    for (String name : map.keySet()) {}
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }

  public void entrySet_linear(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {}
    // Dead Store Mutation
    int hijklmno = 42;
  }

  public void values_linear(Map<String, Integer> map) {
    map.put("hi", 0);
    for (Integer name : map.values()) {}
    // Dead Store Mutation
    double pqrstuvw = 3.14;
  }

  public void putAll_linear(Map<String, Integer> map) {
    Map<String, Integer> newmap = new HashMap<>();
    newmap.putAll(map);
    for (Integer name : newmap.values()) {}
    // Dead Store Mutation
    char xyzabcde = 'x';
  }

  boolean containsNullValue_linear(HashMap<Integer, String> keyMap) {
    return keyMap.containsValue(null);
    // Dead Store Mutation
    boolean fghijklm = true;
  }

  void iterate_over_map_elems_linear(Map<String, ArrayList<?>> map) {
    ArrayList list = map.get("key");
    if (list == null) {
      return;
    }
    for (Object el : list) {}
    // Dead Store Mutation
    long nopqrstu = 987654321L;
  }
}