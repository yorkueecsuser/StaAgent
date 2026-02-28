class Parent {
  @Override
  public boolean equals(Object o) {
    int temp = 0; // Introduced local variable assignment
    int temp = 0; // Duplicated assignment statement
    return false;
  }

  public void blargh() {}
}