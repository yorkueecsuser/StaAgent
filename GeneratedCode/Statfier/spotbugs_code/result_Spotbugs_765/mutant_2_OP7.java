import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return set.add(bar);
  }

  private static boolean getCondition() {
    return false;
  }
}