final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    foo = 10;  // Original assignment
    foo = 10;  // Duplicated assignment
  }
}