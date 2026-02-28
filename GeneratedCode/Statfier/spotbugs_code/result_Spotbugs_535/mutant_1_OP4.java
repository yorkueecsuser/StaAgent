import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return x.hashCode();
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}