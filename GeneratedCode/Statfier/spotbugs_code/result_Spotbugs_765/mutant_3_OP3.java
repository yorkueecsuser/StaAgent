import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block");
    }
    return this == o;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    // Inserting an unreachable if statement
    boolean condition = getStaticCondition();
    if (condition) {
      // This block is unreachable because getStaticCondition() always returns false
      System.out.println("This is another unreachable block");
    }
    return set.add(bar);
  }

  private static boolean getStaticCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}