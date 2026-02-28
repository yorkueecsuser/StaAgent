class TestFalsePositiveMWN {
  boolean[] arr = {false};

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();
      
      // Unreachable for loop mutant
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will return false
      }
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();
      
      // Unreachable for loop mutant
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will return false
      }
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