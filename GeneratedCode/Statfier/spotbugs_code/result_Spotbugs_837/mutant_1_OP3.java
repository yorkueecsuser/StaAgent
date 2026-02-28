import java.util.Hashtable;
import java.util.Properties;

class Ideas_2009_10_05 {

  public void propertiesCantContainNull(Properties p) {
    p.put("a", null);
    p.put(null, "a");
    p.get(null);
    p.getProperty(null);
    p.getProperty(null, "foo");
    p.setProperty(null, "a");
    p.setProperty("a", null);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      p.put("unreachableKey", "unreachableValue");
    }
  }

  public void hashtablesCantContainNull(Hashtable h) {
    h.put("a", null);
    h.put(null, "a");
    h.get(null);
    h.contains(null);
    h.containsKey(null);
    h.containsValue(null);
    h.remove(null);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      h.put("unreachableKey", "unreachableValue");
    }
  }

  private boolean getCondition() {
    return false;
  }
}