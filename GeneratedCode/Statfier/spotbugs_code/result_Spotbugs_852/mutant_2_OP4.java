import java.util.HashMap;

class UseOfNonHashableClassInHashDataStructure {

  static class UMap extends HashMap<UseOfNonHashableClassInHashDataStructure, String> {}
  ;

  static HashMap<UseOfNonHashableClassInHashDataStructure, String> m =
      new HashMap<UseOfNonHashableClassInHashDataStructure, String>();

  static int foo(HashMap<UseOfNonHashableClassInHashDataStructure, String> map) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
    return map.size();
  }

  @Override
  public boolean equals(Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return hashCode() == o.hashCode();
    } else {
      // Unreachable else block
      return false;
    }
  }

  public static String add(UseOfNonHashableClassInHashDataStructure b, String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return m.put(b, s);
    } else {
      // Unreachable else block
      return null;
    }
  }

  public static String get(UseOfNonHashableClassInHashDataStructure b) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return m.get(b);
    } else {
      // Unreachable else block
      return "Unreachable";
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the else blocks unreachable
  }
}