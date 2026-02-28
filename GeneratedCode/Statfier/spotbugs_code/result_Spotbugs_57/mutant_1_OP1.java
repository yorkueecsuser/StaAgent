import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);
    // Mutant code added here
    String jxqfvtbn = "unusedVariable";
  }
}