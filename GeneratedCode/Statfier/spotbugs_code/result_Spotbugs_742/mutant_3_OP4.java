class TestFalsePositiveMWN {
  boolean[] arr = {false};

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();
      
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Code that should never run
        System.out.println("This is an unreachable if block");
      } else {
        // Alternative code that should also never run
        System.out.println("This is an unreachable else block");
      }
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      while (!arr[0]) arr.wait();
      
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Code that should never run
        System.out.println("This is an unreachable if block in test");
      } else {
        // Alternative code that should also never run
        System.out.println("This is an unreachable else block in test");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}