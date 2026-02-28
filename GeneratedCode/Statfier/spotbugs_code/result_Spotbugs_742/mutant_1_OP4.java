class TestFalsePositiveMWN {
  boolean[] arr = {false};
  boolean condition = false; // Non-final variable to ensure dynamic condition

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();

      // Inserting unreachable if-else branch
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if block");
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block");
      }
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();

      // Inserting unreachable if-else branch
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if block in test");
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block in test");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }
}