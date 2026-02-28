import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable");
    }
  }

  private boolean getCondition() {
    // This method returns a condition that will always make the else block unreachable
    return true;
  }
}