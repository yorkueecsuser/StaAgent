import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
    return set.add(bar);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}