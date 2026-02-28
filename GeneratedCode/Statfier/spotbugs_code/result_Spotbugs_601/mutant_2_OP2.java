class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    super.finalize(); // Duplicate of the original method call
  }
}