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
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  private final Map<String, String> map1 = new NonSerializableMap(); // = new
  // LinkedHashMap<String,
  // String>();

  private final Map<String, String> map2;

  private final Map<String, String> map3 = new LinkedHashMap<String, String>();

  public Bug2983950(Map<String, String> m) {
    map2 = m;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This should never be printed in constructor");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed in constructor");
    }
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

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}