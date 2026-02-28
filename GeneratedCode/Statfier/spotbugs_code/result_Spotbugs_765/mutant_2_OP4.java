import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block.");
    }
    return this == o;
  }

  private boolean getCondition() {
    // Always returns false to ensure the else block is unreachable
    return false;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    // Inserting unreachable if-else statement
    boolean shouldRun = getStaticCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block in foo.");
    } else {
      // This block is unreachable because getStaticCondition() always returns false
      System.out.println("This is an unreachable block in foo.");
    }
    return set.add(bar);
  }

  private static boolean getStaticCondition() {
    // Always returns false to ensure the else block is unreachable
    return false;
  }
}