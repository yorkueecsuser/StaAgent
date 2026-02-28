import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable case
        System.out.println("This is another unreachable case.");
        break;
    }
    return set.add(bar);
  }

  private static boolean getCondition() {
    return false;
  }
}