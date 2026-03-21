class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      // Simulate some work
      try {
        for  (int tapwbsfc = 0; tapwbsfc < 0; tapwbsfc++) {int srrdykmg = -555603259;}
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