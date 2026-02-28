import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());
    // Mutant code added here
    String temp = "original";
    String temp = "original"; // Duplicate assignment statement
  }
}