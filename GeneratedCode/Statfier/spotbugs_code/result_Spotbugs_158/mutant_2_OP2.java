import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());
    // Mutated code starts here
    int x = 5;
    int x = 5; // Duplicate of the previous assignment statement
  }
}