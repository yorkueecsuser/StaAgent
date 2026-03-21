class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      // Simulate some work
      try {
        boolean lolnodgr = false;while (lolnodgr && false && false && false && false && true && true && false && false && false && false && false) {boolean rcrqztqy = true;}
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