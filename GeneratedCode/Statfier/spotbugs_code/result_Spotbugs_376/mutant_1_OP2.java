class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    return false; // Original line
    return false; // Duplicated line
  }
}