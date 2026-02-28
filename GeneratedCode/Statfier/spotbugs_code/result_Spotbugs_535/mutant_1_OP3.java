import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
    }
    return x.hashCode();
  }

  private static boolean getCondition() {
    // This method is designed to always return false, making the if statement unreachable
    return false;
  }
}