import java.util.HashMap;

class UseOfNonHashableClassInHashDataStructure {

  static class UMap extends HashMap<UseOfNonHashableClassInHashDataStructure, String> {}
  ;

  static HashMap<UseOfNonHashableClassInHashDataStructure, String> m =
      new HashMap<UseOfNonHashableClassInHashDataStructure, String>();

  static int foo(HashMap<UseOfNonHashableClassInHashDataStructure, String> map) {
    int qzjxvbnr = 42; // Dead store
    return map.size();
  }

  @Override
  public boolean equals(Object o) {
    return hashCode() == o.hashCode();
  }

  public static String add(UseOfNonHashableClassInHashDataStructure b, String s) {
    String wmpyflkj = "unused"; // Dead store
    return m.put(b, s);
  }

  public static String get(UseOfNonHashableClassInHashDataStructure b) {
    double hgfdsaqw = 3.14; // Dead store
    return m.get(b);
  }
}