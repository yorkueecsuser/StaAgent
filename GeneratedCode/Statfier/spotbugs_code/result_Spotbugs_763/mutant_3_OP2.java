class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) {
      return true;
      return true; // Duplicated return statement
    }
    System.exit(1);
    return false;
  }
}