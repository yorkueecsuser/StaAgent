import java.util.concurrent.ConcurrentHashMap;

class CHM {

  ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

  int getLength(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is an unreachable if-else statement
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
    return map.get(s).length();
  }

  void put(String k, String v) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is an unreachable if-else statement
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
    if (k == null) map.put(k, v); // should warn here about k being null
  }

  private boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}