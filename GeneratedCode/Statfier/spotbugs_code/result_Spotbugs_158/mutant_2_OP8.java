import android.support.annotation.Nullable;

class UncheckedNullableReturn {
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