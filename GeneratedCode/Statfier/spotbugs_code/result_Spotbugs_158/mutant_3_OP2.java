import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());
    // Mutated code starts here
    int temp = 0; // Original assignment statement
    int temp = 0; // Duplicated assignment statement
  }
}