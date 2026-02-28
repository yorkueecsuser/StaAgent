import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }
    return this == o;
  }

  private boolean getCondition() {
    // Always returns false, making the if-block unreachable
    return false;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    return set.add(bar);
  }
}