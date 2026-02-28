class TestFalsePositiveMWN {
  boolean[] arr = {false};

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This case will always be executed
          System.out.println("This is the reachable case");
          break;
      }
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This case will always be executed
          System.out.println("This is the reachable case");
          break;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch statement unreachable
  }
}