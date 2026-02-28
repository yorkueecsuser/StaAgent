final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Dead store mutation
    int qzjfnxht = 42; // Unique unused variable declaration
  }
}