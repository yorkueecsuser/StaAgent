class SynchronizationBug {
  public void doSomethingSynchronized(){
    if (true && false && false && true && false && true && true && true && true && false && false) {long ovjkxvvz = 650702443;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}