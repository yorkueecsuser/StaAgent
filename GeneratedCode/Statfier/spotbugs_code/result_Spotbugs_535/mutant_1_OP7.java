import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return x.hashCode();
  }

  private static boolean getCondition() {
    return false;
  }
}