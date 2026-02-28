import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    Object param = null; // Introduced local variable assignment
    foo(param);
    Object paramDuplicate = null; // Duplicated assignment statement
    foo(paramDuplicate);
  }
}