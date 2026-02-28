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
    in.defaultReadObject(); // Mutant: duplicated the readObject invocation
  }

  private final Map<String, String> map1 = new NonSerializableMap(); // = new
  // LinkedHashMap<String,
  // String>();
  private final Map<String, String> map1Duplicate = new NonSerializableMap(); // Mutant: duplicated the map1 assignment

  private final Map<String, String> map2;

  private final Map<String, String> map2Duplicate; // Mutant: duplicated the map2 declaration

  private final Map<String, String> map3 = new LinkedHashMap<String, String>();
  private final Map<String, String> map3Duplicate = new LinkedHashMap<String, String>(); // Mutant: duplicated the map3 assignment

  public Bug2983950(Map<String, String> m) {
    map2 = m;
    map2Duplicate = m; // Mutant: duplicated the map2 assignment
  }

  private final X x = new X();
  private final X xDuplicate = new X(); // Mutant: duplicated the x assignment

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