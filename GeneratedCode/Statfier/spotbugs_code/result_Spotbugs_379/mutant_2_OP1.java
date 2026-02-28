class Parent {
  @Override
  public boolean equals(Object o) {
    String jxvqbnrt = "unused"; // Dead store mutation
    return false;
  }

  public void blargh() {
    int zyxcvbnm = 42; // Dead store mutation
  }
}