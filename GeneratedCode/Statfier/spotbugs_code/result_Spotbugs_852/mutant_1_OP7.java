import java.util.HashMap;

class UseOfNonHashableClassInHashDataStructure {

  static class UMap extends HashMap<UseOfNonHashableClassInHashDataStructure, String> {}
  ;

  static HashMap<UseOfNonHashableClassInHashDataStructure, String> m =
      new HashMap<UseOfNonHashableClassInHashDataStructure, String>();

  static int foo(HashMap<UseOfNonHashableClassInHashDataStructure, String> map) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return map.size();
  }

  @Override
  public boolean equals(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return hashCode() == o.hashCode();
  }

  public static String add(UseOfNonHashableClassInHashDataStructure b, String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return m.put(b, s);
  }

  public static String get(UseOfNonHashableClassInHashDataStructure b) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return m.get(b);
  }

  private static boolean getCondition() {
    return false;
  }
}