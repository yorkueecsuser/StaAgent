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
  ConcurrentHashMap<String, String> m = new ConcurrentHashMap<String, String>();

  int getLen(String t) {
    return m.get(t).length();
  }

  void p(String x, String y) {
    if (x == null) m.put(x, y);
  }
}