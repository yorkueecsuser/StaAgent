class TestFalsePositiveMWN {
  boolean[] arr = {false};

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }

  private boolean getCondition() {
    return false;
  }
}