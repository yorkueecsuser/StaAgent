class Bug2913745 {
  public void test(int seconds) {
    long startNanos = System.nanoTime();
    long currentNanos = System.nanoTime();
    currentNanos = System.nanoTime(); // Mutant: duplicated assignment
    if (currentNanos - startNanos > seconds * 1000 * 1000 * 1000L)
      throw new RuntimeException((currentNanos - startNanos) + " nanos");
  }

  public static void main(String[] arg) {
    int seconds = 3000;
    seconds = 3000; // Mutant: duplicated assignment
    System.out.println(Integer.MAX_VALUE / 1000000 + 1);
    long nanos = seconds * 1000 * 1000 * 1000L;
    nanos = seconds * 1000 * 1000 * 1000L; // Mutant: duplicated assignment
    System.out.println(nanos);
  }
}