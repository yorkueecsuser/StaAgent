class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    String abcdefgh = "unused"; // Dead store
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      int hijklmno = 42; // Dead store
      return standardEquals(o);
    }
  }
}