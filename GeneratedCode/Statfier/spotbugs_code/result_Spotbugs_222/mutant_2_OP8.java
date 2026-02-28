final class ProtectedMemberOfFinalClass {
  protected int foo;
  protected int a; // Mutant: Renamed 'foo' to 'a'

  protected void bar() {}

  protected void baz() { // Mutant: Added a new method to use the renamed variable
    a = 10; // Using the renamed variable 'a'
  }
}