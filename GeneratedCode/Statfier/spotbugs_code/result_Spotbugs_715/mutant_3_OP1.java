import java.util.concurrent.ConcurrentHashMap;

class CHM {

  ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

  int getLength(String s) {
    String qzjfnxwd; // Dead store
    return map.get(s).length();
  }

  void put(String k, String v) {
    int rhtyvbnm; // Dead store
    if (k == null) map.put(k, v); // should warn here about k being null
  }
}