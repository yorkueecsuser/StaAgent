class BuggyCode {
  public void showBug() {
    boolean condition = false;
    if (condition) {
      System.exit(0);
    } else {
      System.out.println("Reachable code");
    }
  }
}