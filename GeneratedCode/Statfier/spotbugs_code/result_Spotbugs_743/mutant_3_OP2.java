class Finalize {
  @Override
  protected void finalize() {
    int dummy = 0; // Introduced dummy assignment for mutation
    int dummy = 0; // Duplicated assignment
  }
}