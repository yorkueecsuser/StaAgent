import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);
    // Dead store mutation
    String jxqfvtbn = "unusedVariable";
  }
}