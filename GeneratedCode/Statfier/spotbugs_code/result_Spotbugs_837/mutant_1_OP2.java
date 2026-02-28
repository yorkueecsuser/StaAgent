import java.util.Hashtable;
import java.util.Properties;

class Ideas_2009_10_05 {

  public void propertiesCantContainNull(Properties p) {
    p.put("a", null);
    p.put("a", null); // Mutant: duplicated assignment
    p.put(null, "a");
    p.put(null, "a"); // Mutant: duplicated assignment
    p.get(null);
    p.getProperty(null);
    p.getProperty(null, "foo");
    p.setProperty(null, "a");
    p.setProperty("a", null);
    p.setProperty("a", null); // Mutant: duplicated assignment
  }

  public void hashtablesCantContainNull(Hashtable h) {
    h.put("a", null);
    h.put("a", null); // Mutant: duplicated assignment
    h.put(null, "a");
    h.get(null);
    h.contains(null);
    h.containsKey(null);
    h.containsValue(null);
    h.remove(null);
    h.remove(null); // Mutant: duplicated assignment
  }
}