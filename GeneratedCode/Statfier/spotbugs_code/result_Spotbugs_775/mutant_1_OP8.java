import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashMap;

class Bug3572704 {
  public static HashMap<String, String> map = new HashMap<String, String>();

  @ExpectWarning("DLS_DEAD_LOCAL_STORE")
  public static String test(String name) {
    int pos = 0;
    while (pos >= 0 &&!name.isEmpty())
      ;
    {
      if (map.containsKey(name)) {
        return name;
      }
      pos = name.indexOf('.');
      name = name.substring(pos + 1);
      // ^^^ "Dead store to name" here
    }
    return null;
  }

  // Mutated code
  @ExpectWarning("DLS_DEAD_LOCAL_STORE")
  public static String testa(String name) {
    int q = 0;
    while (q >= 0 &&!name.isEmpty())
      ;
    {
      if (map.containsKey(name)) {
        return name;
      }
      q = name.indexOf('.');
      name = name.substring(q + 1);
      // ^^^ "Dead store to name" here
    }
    return null;
  }

  @NoWarning("DLS_DEAD_LOCAL_STORE")
  public static String test2(String name) {
    int pos = 0;
    while (pos >= 0 &&!name.isEmpty()) {
      if (map.containsKey(name)) {
        return name;
      }
      pos = name.indexOf('.');
      name = name.substring(pos + 1);
      // ^^^ "Dead store to name" here
    }
    return null;
  }

  // Mutated code
  @NoWarning("DLS_DEAD_LOCAL_STORE")
  public static String test2b(String name) {
    int r = 0;
    while (r >= 0 &&!name.isEmpty()) {
      if (map.containsKey(name)) {
        return name;
      }
      r = name.indexOf('.');
      name = name.substring(r + 1);
      // ^^^ "Dead store to name" here
    }
    return null;
  }
}