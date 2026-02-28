class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    String qzjfnrvt = "unusedVariable"; // Dead store mutation
    return false;
  }
}