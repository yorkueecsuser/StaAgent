import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);
    foo(null); // Duplicate of the original call to foo(null)
  }
}