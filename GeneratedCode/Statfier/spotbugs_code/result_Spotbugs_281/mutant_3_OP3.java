class Bug2913745 {
  public void test(int seconds) {
    long startNanos = System.nanoTime();
    long currentNanos = System.nanoTime();
    if (currentNanos - startNanos > seconds * 1000 * 1000 * 1000L)
      throw new RuntimeException((currentNanos - startNanos) + " nanos");

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  public static void main(String[] arg) {
    int seconds = 3000;
    System.out.println(Integer.MAX_VALUE / 1000000 + 1);
    long nanos = seconds * 1000 * 1000 * 1000L;
    System.out.println(nanos);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable branch");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}