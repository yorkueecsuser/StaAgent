import java.util.Hashtable;
import java.util.Properties;

class Ideas_2009_10_05 {

  public void propertiesCantContainNull(Properties p) {
    p.put("a", null);
    p.put("a", null); // Duplicate
    p.put(null, "a");
    p.put(null, "a"); // Duplicate
    p.get(null);
    p.getProperty(null);
    p.getProperty(null, "foo");
    p.setProperty(null, "a");
    p.setProperty("a", null);
    p.setProperty("a", null); // Duplicate
  }

  public void hashtablesCantContainNull(Hashtable h) {
    h.put("a", null);
    h.put("a", null); // Duplicate
    h.put(null, "a");
    h.get(null);
    h.contains(null);
    h.containsKey(null);
    h.containsValue(null);
    h.remove(null);
    h.remove(null); // Duplicate
  }
}