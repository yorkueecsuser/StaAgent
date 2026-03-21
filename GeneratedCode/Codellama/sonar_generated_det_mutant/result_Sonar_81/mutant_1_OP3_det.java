class SynchronizationBug {
  public void doSomethingSynchronized(){
    if (false && false && true && false && true && true && true && true && true && false && false) {float kqkhyvcm = 355662302;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}