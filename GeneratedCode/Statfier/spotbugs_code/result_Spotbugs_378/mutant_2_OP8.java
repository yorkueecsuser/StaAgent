class Equality {

  public boolean equals(Equality e) {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return false;
  }

  public static void main(String[] args) {}

  // Mutated method with renamed variable
  public boolean equals(Equality x) {
    return true;
  }

  @Override
  public boolean equals(Object p) {
    return false;
  }
}