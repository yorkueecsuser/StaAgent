class Bug2913745 {
  public void test(int seconds) {
    long startNanos = System.nanoTime();
    long currentNanos = System.nanoTime();
    if (currentNanos - startNanos > seconds * 1000 * 1000 * 1000L)
      throw new RuntimeException((currentNanos - startNanos) + " nanos");

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if getCondition() returns true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block.");
    }
  }

  private boolean getCondition() {
    // Always return false to make the else block unreachable
    return false;
  }

  public static void main(String[] arg) {
    int seconds = 3000;
    System.out.println(Integer.MAX_VALUE / 1000000 + 1);
    long nanos = seconds * 1000 * 1000 * 1000L;
    System.out.println(nanos);
  }
}