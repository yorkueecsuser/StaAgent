import java.util.HashMap;

class UseOfNonHashableClassInHashDataStructure {

  static class UMap extends HashMap<UseOfNonHashableClassInHashDataStructure, String> {}
  ;

  static HashMap<UseOfNonHashableClassInHashDataStructure, String> m =
      new HashMap<UseOfNonHashableClassInHashDataStructure, String>();

  static int foo(HashMap<UseOfNonHashableClassInHashDataStructure, String> map) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This code runs if shouldRun is true.");
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable if-else branch.");
    }
    return map.size();
  }

  @Override
  public boolean equals(Object o) {
    return hashCode() == o.hashCode();
  }

  public static String add(UseOfNonHashableClassInHashDataStructure b, String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("Adding to map if shouldRun is true.");
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable if-else branch in add method.");
    }
    return m.put(b, s);
  }

  public static String get(UseOfNonHashableClassInHashDataStructure b) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("Getting from map if shouldRun is true.");
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable if-else branch in get method.");
    }
    return m.get(b);
  }

  private static boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}