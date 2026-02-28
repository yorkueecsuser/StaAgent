class TestFalsePositiveMWN {
  boolean[] arr = {false};
  boolean conditionFor = false;

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();
      // Inserting unreachable for loop
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
        System.out.println("This loop is unreachable");
      }
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();
      // Inserting unreachable for loop
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
        System.out.println("This loop is unreachable");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }
}