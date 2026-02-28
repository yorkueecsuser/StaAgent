class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    return false; // Original statement
    return false; // Duplicated statement
  }
}