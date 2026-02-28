import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to ensure the switch is not empty and reachable
        break;
    }
    return x.hashCode();
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}