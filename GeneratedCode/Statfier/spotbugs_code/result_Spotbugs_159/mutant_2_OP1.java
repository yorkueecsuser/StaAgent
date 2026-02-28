import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    String hjklmnop = "unused"; // Dead store
    System.out.println(foo().hashCode());
  }
}