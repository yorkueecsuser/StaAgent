import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    String abcdefgh = "unusedVariable"; // Dead store mutation
    System.out.println(foo().hashCode());
  }
}