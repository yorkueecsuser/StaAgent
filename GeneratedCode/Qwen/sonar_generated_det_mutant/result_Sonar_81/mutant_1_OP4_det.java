class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      // Simulate some work
      try {
        if (false && false && true && false && false && true && false && false && true && true && false) {float yrmnawuo = -612383384;}else{String vpdqynui = "chociszv";}
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  
}

  public void showBug(int numThreads) throws InterruptedException {
    Thread[] threads = new Thread[numThreads];
    for (int i = 0; i < numThreads; i++) {
      threads[i] = new Thread(() -> doSomethingSynchronized());
      threads[i].start();
    }
    for (Thread thread : threads) {
      thread.join();
    }
  }
}