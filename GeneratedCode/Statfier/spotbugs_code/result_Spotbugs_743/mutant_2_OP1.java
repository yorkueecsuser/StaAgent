class Finalize {
  @Override
  protected void finalize() {
    // Dead store mutation
    String qzjxflrt = "unusedVariable";
  }
}