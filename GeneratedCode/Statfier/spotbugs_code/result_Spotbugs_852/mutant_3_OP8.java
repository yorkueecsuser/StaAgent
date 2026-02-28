import java.util.HashMap;

class UseOfNonHashableClassInHashDataStructure {

  static class UMap extends HashMap<UseOfNonHashableClassInHashDataStructure, String> {}
  ;

  static HashMap<UseOfNonHashableClassInHashDataStructure, String> m =
      new HashMap<UseOfNonHashableClassInHashDataStructure, String>();

  static int foo(HashMap<UseOfNonHashableClassInHashDataStructure, String> map) {
    return map.size();
  }

  @Override
  public boolean equals(Object o) {
    return hashCode() == o.hashCode();
  }

  public static String add(UseOfNonHashableClassInHashDataStructure b, String s) {
    return m.put(b, s);
  }

  public static String get(UseOfNonHashableClassInHashDataStructure b) {
    return m.get(b);
  }

  // Mutated code
  static HashMap<UseOfNonHashableClassInHashDataStructure, String> n =
      new HashMap<UseOfNonHashableClassInHashDataStructure, String>();

  static int bar(HashMap<UseOfNonHashableClassInHashDataStructure, String> x) {
    return x.size();
  }

  public static String put(UseOfNonHashableClassInHashDataStructure c, String t) {
    return n.put(c, t);
  }

  public static String retrieve(UseOfNonHashableClassInHashDataStructure c) {
    return n.get(c);
  }
}