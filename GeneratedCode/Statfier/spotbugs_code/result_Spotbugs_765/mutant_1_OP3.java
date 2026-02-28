import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return this == o;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    boolean condition = getCondition();
    if (condition) {
      // This is another unreachable if statement
      System.out.println("This is another unreachable statement");
    }
    return set.add(bar);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}