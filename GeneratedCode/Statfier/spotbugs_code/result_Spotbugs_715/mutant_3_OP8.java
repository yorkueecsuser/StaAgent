import java.util.concurrent.ConcurrentHashMap;

class CHM {

  ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

  int getLength(String s) {
    return map.get(s).length();
  }

  void put(String k, String v) {
    if (k == null) map.put(k, v); // should warn here about k being null
  }

  // Mutated code
  int getLength(String t) {
    return map.get(t).length();
  }

  void put(String x, String y) {
    if (x == null) map.put(x, y); // should warn here about x being null
  }
}