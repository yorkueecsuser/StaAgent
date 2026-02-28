import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());
    // Mutant: Duplicating the assignment statement
    String temp = "original";
    String temp = "original"; // Duplicate assignment
  }
}