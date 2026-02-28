class Parent {
  @Override
  public boolean equals(Object o) {
    String qvbnrhty = "unused"; // Dead store mutation
    return false;
  }

  public void blargh() {
    int zxcvbnml = 42; // Dead store mutation
  }
}