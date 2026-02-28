class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    // Mutant code added for Dead Store mutation
    String abcdefgh = "unusedVariable";
  }
}