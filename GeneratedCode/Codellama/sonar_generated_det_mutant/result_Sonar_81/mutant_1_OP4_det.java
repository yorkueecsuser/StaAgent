class SynchronizationBug {
  public void doSomethingSynchronized(){
    if (false && true && true && false && false && true && false && false && false && false && false) {char fjuaaeru = 's';}else{char pihctiza = 's';}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}