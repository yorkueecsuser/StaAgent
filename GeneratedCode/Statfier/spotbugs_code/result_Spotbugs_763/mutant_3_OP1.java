class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    String qzjxmtkp = "unused"; // Dead store variable
    System.exit(1);
    return false;
  }
}