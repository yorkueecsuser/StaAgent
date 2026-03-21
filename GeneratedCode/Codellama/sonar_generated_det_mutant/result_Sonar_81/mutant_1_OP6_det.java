class SynchronizationBug {
  public void doSomethingSynchronized(){
    for  (int zgkwryqa = 0; zgkwryqa < 0; zgkwryqa++) {String dcopfown = "vyzimvex";}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}