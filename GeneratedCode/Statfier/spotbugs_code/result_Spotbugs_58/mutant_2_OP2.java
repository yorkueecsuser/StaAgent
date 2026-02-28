import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    Object localVar = null; // Introduced local variable assignment
    Object localVar = null; // Duplicate of the above assignment

    foo(null);
  }
}