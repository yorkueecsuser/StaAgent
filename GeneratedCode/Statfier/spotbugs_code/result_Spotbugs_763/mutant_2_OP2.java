class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) {
      boolean result = true; // Original assignment logic
      boolean resultDuplicate = true; // Duplicate of the assignment logic
      return result;
    }
    System.exit(1);
    return false;
  }
}