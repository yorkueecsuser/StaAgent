final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {}

  protected void baz() {
    int temp = 10; // Original assignment statement
    int temp = 10; // Duplicated assignment statement
  }
}