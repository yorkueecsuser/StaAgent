import edu.umd.cs.findbugs.annotations.NonNull;
import java.io.File;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
class Bug1871376 implements Serializable {

  private static final long serialVersionUID = new Long(1L);

  @GuardedBy("Bug1871376.class")
  private static boolean s_builtAMap = false;

  private final Date m_created = new Date();

  @GuardedBy("itself")
  private NonSerializableMap m_map = null;

  public Bug1871376() {

    boolean a = false;

    if (!a) a = true;

    new File("temp.txt").delete();
  }

  public Date getCreationDate() {

    return m_created;
  }

  public String getFirstCharOfKey(@NonNull String key) {

    String b = null;

    if (null == m_map) {

      synchronized (this) {
        if (null == m_map) {

          System.out.println("Value: " + m_map.get(key));

          m_map = new NonSerializableMap();

          b = m_map.get(key);

          s_builtAMap = true;
        }
      }

    } else {

      b = m_map.get(key);
    }

    return b.substring(0, 1);
  }

  public static synchronized boolean didBuildAMap() {

    return s_builtAMap;
  }

  public static void main(String[] args) {

    Bug1871376 buggy = new Bug1871376();

    String c = null;

    buggy.getFirstCharOfKey(c);

    synchronized (buggy) {
      System.out.println("Built a map: " + s_builtAMap);
    }
  }

  private class NonSerializableMap extends AbstractMap<String, String> {

    private final Map<String, String> d = new HashMap<String, String>();

    @Override
    public Set<java.util.Map.Entry<String, String>> entrySet() {

      return d.entrySet();
    }
  }
}