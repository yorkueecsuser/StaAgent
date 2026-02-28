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

    // Mutated code
    Properties q = p;
    q.put("b", null);
    q.put(null, "b");
    q.get(null);
    q.getProperty(null);
    q.getProperty(null, "bar");
    q.setProperty(null, "b");
    q.setProperty("b", null);
  }

  public void hashtablesCantContainNull(Hashtable h) {
    h.put("a", null);
    h.put(null, "a");
    h.get(null);
    h.contains(null);
    h.containsKey(null);
    h.containsValue(null);
    h.remove(null);

    // Mutated code
    Hashtable i = h;
    i.put("b", null);
    i.put(null, "b");
    i.get(null);
    i.contains(null);
    i.containsKey(null);
    i.containsValue(null);
    i.remove(null);
  }
}