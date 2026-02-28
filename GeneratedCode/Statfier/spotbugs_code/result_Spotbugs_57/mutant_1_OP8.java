import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);
  }

  // Mutated code
  static void baz(@NonNull Object a) {}

  static void qux() {
    baz(null);
  }
}