import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());
    // Dead store mutation
    String yjvqzrht = "unusedVariable";
  }
}