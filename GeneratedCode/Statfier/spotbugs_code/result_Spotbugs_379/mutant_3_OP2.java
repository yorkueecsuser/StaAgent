class Parent {
  @Override
  public boolean equals(Object o) {
    return false;
  }

  public void blargh() {
    int x = 5; // Introduced assignment statement for demonstration
    int x = 5; // Duplicated assignment statement
  }
}