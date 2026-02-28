class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    System.exit(1);
    return false;
  }

  // Mutated code with renaming operator
  @Override
  public boolean equals(Object a) {
    if (a instanceof CallSystemExit) return true;
    System.exit(1);
    return false;
  }
}