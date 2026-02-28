import java.util.concurrent.ConcurrentHashMap;

class CHM {

  ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

  int getLength(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return map.get(s).length();
  }

  void put(String k, String v) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    if (k == null) map.put(k, v); // should warn here about k being null
  }

  private boolean getCondition() {
    return false;
  }
}