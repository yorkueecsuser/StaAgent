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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return hashCode() == o.hashCode();
  }

  public static String add(UseOfNonHashableClassInHashDataStructure b, String s) {
    return m.put(b, s);
  }

  public static String get(UseOfNonHashableClassInHashDataStructure b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return m.get(b);
  }

  private static boolean getCondition() {
    return false;
  }
}