class Equality {

  public boolean equals(Equality e) {
    return true; // Original return statement
    return true; // Duplicated return statement
  }

  @Override
  public boolean equals(Object o) {
    return false; // Original return statement
    return false; // Duplicated return statement
  }

  public static void main(String[] args) {}
}