class Bug2913745 {
  public void test(int seconds) {
    long startNanos = System.nanoTime();
    long currentNanos = System.nanoTime();
    if (currentNanos - startNanos > seconds * 1000 * 1000 * 1000L)
      throw new RuntimeException((currentNanos - startNanos) + " nanos");
    
    // Mutant code
    long x = System.nanoTime();
    long y = System.nanoTime();
    if (y - x > seconds * 1000 * 1000 * 1000L)
      throw new RuntimeException((y - x) + " nanos");
  }

  public static void main(String[] arg) {
    int seconds = 3000;
    System.out.println(Integer.MAX_VALUE / 1000000 + 1);
    long nanos = seconds * 1000 * 1000 * 1000L;
    System.out.println(nanos);
    
    // Mutant code
    int a = 3000;
    System.out.println(Integer.MAX_VALUE / 1000000 + 1);
    long b = a * 1000 * 1000 * 1000L;
    System.out.println(b);
  }
}