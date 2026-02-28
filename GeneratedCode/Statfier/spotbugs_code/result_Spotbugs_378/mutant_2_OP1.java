class Equality {

  public boolean equals(Equality e) {
    String abcdefgh = "unusedVariable"; // Dead Store mutation
    return true;
  }

  @Override
  public boolean equals(Object o) {
    int hijklmno = 42; // Dead Store mutation
    return false;
  }

  public static void main(String[] args) {}
}