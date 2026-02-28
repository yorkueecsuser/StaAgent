class TestFalsePositiveMWN {
  boolean[] arr = {false};

  public void set() throws Exception {
    // This is a false positive
    synchronized (arr) {
      arr[0] = true;
      arr.notify();
    }
  }

  public void test() throws Exception {
    // This is a false positive
    synchronized (arr) {
      do {
        if (!arr[0]) arr.wait();
      } while (!arr[0]);
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }
}