import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());
  }

  // Mutated code
  void baz() {
    System.out.println(foo().hashCode());
  }

  void qux() {
    String a = foo();
    System.out.println(a.hashCode());
  }
}