final class ProtectedMemberOfFinalClass {
  protected int foo;
  protected int x; // Mutant variable

  protected void bar() {}

  protected void baz() { // Mutant method
    int a = foo; // Mutant usage of foo
    int b = x;   // Mutant usage of x
  }
}