class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    String abcdefgh = "unusedVariable";
    return false;
  }
}