class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
  }

  // Mutated code
  private int a;
}