import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());
    // Mutant: Duplicating the assignment statement (though there isn't one directly, we duplicate the method call contextually)
    String temp = foo();
    String temp2 = foo(); // Duplicate of the method call contextually
  }
}