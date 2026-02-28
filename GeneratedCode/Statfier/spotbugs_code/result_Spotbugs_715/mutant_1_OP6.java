import java.util.concurrent.ConcurrentHashMap;

class CHM {

  ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

  int getLength(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is always false
    }
    return map.get(s).length();
  }

  void put(String k, String v) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is always false
    }
    if (k == null) map.put(k, v); // should warn here about k being null
  }

  private boolean getCondition() {
    return false;
  }
}