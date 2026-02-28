final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Simulated assignment for demonstration
    foo = 10;  // Original assignment
    foo = 10;  // Duplicated assignment
  }
}