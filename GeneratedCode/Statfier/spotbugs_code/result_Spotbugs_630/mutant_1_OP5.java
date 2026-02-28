import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Bug2983950 implements Serializable {

  private static final long serialVersionUID = 0;

  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        System.out.println("This is reachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }

  private final Map<String, String> map1 = new NonSerializableMap(); // = new
  // LinkedHashMap<String,
  // String>();

  private final Map<String, String> map2;

  private final Map<String, String> map3 = new LinkedHashMap<String, String>();

  public Bug2983950(Map<String, String> m) {
    map2 = m;
  }

  private final X x = new X();

  static class X {
    int y;
  }

  static class NonSerializableMap extends AbstractMap {

    @Override
    public Set entrySet() {
      return Collections.emptySet();
    }
  }
}