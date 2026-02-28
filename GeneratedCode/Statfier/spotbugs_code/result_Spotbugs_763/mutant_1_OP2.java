class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    if (o instanceof CallSystemExit) return true; // Duplicate of the previous if statement
    System.exit(1);
    return false;
  }
}