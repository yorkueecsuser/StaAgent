class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    String qzjxmwfn = "unusedVariable"; // Dead store mutation
    return false;
  }
}