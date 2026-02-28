import java.util.HashMap;

class UseOfNonHashableClassInHashDataStructure {

  static class UMap extends HashMap<UseOfNonHashableClassInHashDataStructure, String> {}
  ;

  static HashMap<UseOfNonHashableClassInHashDataStructure, String> m =
      new HashMap<UseOfNonHashableClassInHashDataStructure, String>();

  static int foo(HashMap<UseOfNonHashableClassInHashDataStructure, String> map) {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
    return map.size();
  }

  @Override
  public boolean equals(Object o) {
    return hashCode() == o.hashCode();
  }

  public static String add(UseOfNonHashableClassInHashDataStructure b, String s) {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is another unreachable loop");
    }
    return m.put(b, s);
  }

  public static String get(UseOfNonHashableClassInHashDataStructure b) {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("Yet another unreachable loop");
    }
    return m.get(b);
  }

  private static boolean getCondition() {
    return false;
  }
}