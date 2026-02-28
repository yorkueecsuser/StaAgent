class Bug2913745 {
  public void test(int seconds) {
    long startNanos = System.nanoTime();
    long currentNanos = System.nanoTime();
    if (currentNanos - startNanos > seconds * 1000 * 1000 * 1000L)
      throw new RuntimeException((currentNanos - startNanos) + " nanos");

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String[] arg) {
    int seconds = 3000;
    System.out.println(Integer.MAX_VALUE / 1000000 + 1);
    long nanos = seconds * 1000 * 1000 * 1000L;
    System.out.println(nanos);

    // Introduced unreachable while loop
    boolean conditionWhile = getStaticCondition();
    while (conditionWhile) {
      // This loop is unreachable because getStaticCondition() returns false
    }
  }

  private static boolean getStaticCondition() {
    return false;
  }
}