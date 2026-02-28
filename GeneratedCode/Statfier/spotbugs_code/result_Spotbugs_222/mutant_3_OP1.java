final class ProtectedMemberOfFinalClass {
  protected int foo;

  protected void bar() {
    // Dead store mutation
    int qwejrtyp;
  }
}