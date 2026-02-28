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
      while (!arr[0]) arr.wait();
    }
  }

  public static void main(String[] args) throws Exception {
    TestFalsePositiveMWN test = new TestFalsePositiveMWN();
    test.set();
    test.test();
  }

  // Mutated code
  boolean[] brr = {false};

  public void setx() throws Exception {
    // This is a false positive
    synchronized (brr) {
      brr[0] = true;
      brr.notify();
    }
  }

  public void testx() throws Exception {
    // This is a false positive
    synchronized (brr) {
      while (!brr[0]) brr.wait();
    }
  }

  public static void mainx(String[] xrgs) throws Exception {
    TestFalsePositiveMWN xest = new TestFalsePositiveMWN();
    xest.setx();
    xest.testx();
  }
}