class SynchronizationBug {
  public void doSomethingSynchronized(){
    for  (int mxhllylx = 0; mxhllylx < 0; mxhllylx++) {double svdrgrep = -62748198;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}