class SynchronizationBug {
  public void doSomethingSynchronized(){
    boolean fchkzzsa = false;while (fchkzzsa && true && true && false && false && true && true && true && false && false && true && false) {float jletiomr = 802788215;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}