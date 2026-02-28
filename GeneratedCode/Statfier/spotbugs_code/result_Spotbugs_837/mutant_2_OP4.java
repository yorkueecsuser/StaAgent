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

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      p.put("unreachableKey", "unreachableValue");
    } else {
      // Alternative code that will also never be executed
      p.remove("unreachableKey");
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

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      h.put("unreachableKey", "unreachableValue");
    } else {
      // Alternative code that will also never be executed
      h.remove("unreachableKey");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}