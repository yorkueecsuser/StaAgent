class TestFalsePositiveMWN {
  boolean[] arr = {false};
  boolean conditionWhile = false;

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();
    }
    // Inserting an unreachable while loop
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop");
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();
    }
    // Inserting an unreachable while loop
    while (conditionWhile) {
      System.out.println("This is another unreachable while loop");
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }
}