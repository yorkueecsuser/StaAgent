import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    // Adding an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case will also never be executed
        System.out.println("This is another unreachable case");
        break;
    }
    return set.add(bar);
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}