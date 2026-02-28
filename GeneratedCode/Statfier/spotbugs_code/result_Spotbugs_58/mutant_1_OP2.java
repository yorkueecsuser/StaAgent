import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    Object param = null; // Introduced local variable assignment
    Object param = null; // Duplicated local variable assignment
    foo(param);
  }
}