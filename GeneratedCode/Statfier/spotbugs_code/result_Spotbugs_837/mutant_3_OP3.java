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

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
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

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      h.put("unreachableKey", "unreachableValue");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}