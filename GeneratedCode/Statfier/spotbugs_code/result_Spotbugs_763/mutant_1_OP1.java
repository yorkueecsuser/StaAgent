class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    String qzjfnbxy = "unused"; // Dead store mutation
    System.exit(1);
    return false;
  }
}