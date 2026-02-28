class CompareToFailure {

  public static void main(String[] args) {}

  public int compareTo(CompareToFailure ctf) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    return 0;
  }

  // public int compareTo(Object o) {
  // return 0;
  // }

  public int recurso() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      recurso();
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in recurso method.");
    }
    return 1;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}