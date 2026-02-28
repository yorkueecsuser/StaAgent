class Bug2913745 {
  public void test(int seconds) {
    long startNanos = System.nanoTime();
    long startNanosCopy = System.nanoTime(); // Duplicate of startNanos assignment
    long currentNanos = System.nanoTime();
    long currentNanosCopy = System.nanoTime(); // Duplicate of currentNanos assignment
    if (currentNanos - startNanos > seconds * 1000 * 1000 * 1000L)
      throw new RuntimeException((currentNanos - startNanos) + " nanos");
  }

  public static void main(String[] arg) {
    int seconds = 3000;
    int secondsCopy = 3000; // Duplicate of seconds assignment
    System.out.println(Integer.MAX_VALUE / 1000000 + 1);
    long nanos = seconds * 1000 * 1000 * 1000L;
    long nanosCopy = seconds * 1000 * 1000 * 1000L; // Duplicate of nanos assignment
    System.out.println(nanos);
  }
}