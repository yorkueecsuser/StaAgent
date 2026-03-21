class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      // Simulate some work
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public void showBug(int numThreads) throws InterruptedException {
    Thread[] threads = new Thread[numThreads];
    { int i = 0; do { threads[i] = new Thread(() -> doSomethingSynchronized());
      threads[i].start(); i++; } while (i < numThreads); }
    for (Thread thread : threads) {
      thread.join();
    }
  }
}