import java.util.concurrent.ConcurrentHashMap;

class CHM {

  ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

  int getLength(String s) {
    return map.get(s).length();
  }

  void put(String k, String v) {
    if (k == null) map.put(k, v); // should warn here about k being null

    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the condition unreachable
  }
}