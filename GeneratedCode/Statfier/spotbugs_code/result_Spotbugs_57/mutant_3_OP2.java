import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);
    foo(null); // Mutated line: duplicated the call to foo(null)
  }
}