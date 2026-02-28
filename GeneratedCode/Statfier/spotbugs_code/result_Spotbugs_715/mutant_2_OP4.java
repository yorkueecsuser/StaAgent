import java.util.concurrent.ConcurrentHashMap;

class CHM {

  ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

  int getLength(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if block");
      } else {
        System.out.println("This is an unreachable else block");
      }
    }
    return map.get(s).length();
  }

  void put(String k, String v) {
    if (k == null) map.put(k, v); // should warn here about k being null
  }

  private boolean getCondition() {
    return true; // This ensures the if block is executed
  }

  private boolean getUnreachableCondition() {
    return false; // This ensures the if-else block inside is unreachable
  }
}