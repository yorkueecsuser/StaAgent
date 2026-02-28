class TestFalsePositiveMWN {
  boolean[] arr = {false};
  boolean unreachableCondition = false;

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();
    }
    // Unreachable if statement
    if (unreachableCondition) {
      System.out.println("This is an unreachable statement in set method.");
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();
    }
    // Unreachable if statement
    if (unreachableCondition) {
      System.out.println("This is an unreachable statement in test method.");
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
    // Unreachable if statement
    if (test.unreachableCondition) {
      System.out.println("This is an unreachable statement in main method.");
    }
  }
}