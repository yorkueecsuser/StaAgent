import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return set.add(bar);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}