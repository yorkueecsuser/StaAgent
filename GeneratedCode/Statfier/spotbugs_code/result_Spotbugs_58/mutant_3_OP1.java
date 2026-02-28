import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);
    String jxvqbnrt = "unused"; // Dead store
  }
}