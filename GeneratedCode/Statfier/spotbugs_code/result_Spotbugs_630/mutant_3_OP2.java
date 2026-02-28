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
    in.defaultReadObject(); // Mutant: duplicated assignment statement
  }

  private final Map<String, String> map1 = new NonSerializableMap(); // = new
  // LinkedHashMap<String,
  // String>();
  private final Map<String, String> map1Copy = new NonSerializableMap(); // Mutant: duplicated assignment statement

  private final Map<String, String> map2;

  private final Map<String, String> map3 = new LinkedHashMap<String, String>();
  private final Map<String, String> map3Copy = new LinkedHashMap<String, String>(); // Mutant: duplicated assignment statement

  public Bug2983950(Map<String, String> m) {
    map2 = m;
    map2 = m; // Mutant: duplicated assignment statement
  }

  private final X x = new X();
  private final X xCopy = new X(); // Mutant: duplicated assignment statement

  static class X {
    int y;
    int yCopy; // Mutant: duplicated field declaration
  }

  static class NonSerializableMap extends AbstractMap {

    @Override
    public Set entrySet() {
      return Collections.emptySet();
    }
  }
}