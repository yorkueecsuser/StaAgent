class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    return false;
  }

  // Mutated code
  public boolean equals(Object x) {
    return false;
  }
}