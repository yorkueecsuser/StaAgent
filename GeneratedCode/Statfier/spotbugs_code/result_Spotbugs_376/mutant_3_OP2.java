class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    return false;
    return false; // Mutant: duplicated return statement
  }
}