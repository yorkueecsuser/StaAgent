class CallSystemExit {

  @Override
  public boolean equals(Object x) {
    if (x instanceof CallSystemExit) return true;
    System.exit(1);
    return false;
  }
}