class Parent {
  @Override
  public boolean equals(Object o) {
    return false;
  }

  public void blargh() {
    int x = 5; // Original assignment statement
    int x = 5; // Duplicated assignment statement
  }
}