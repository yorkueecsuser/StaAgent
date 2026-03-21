class SynchronizationBug {
  public void doSomethingSynchronized(){
    boolean bixdhiqv = false;while (bixdhiqv && false && true && false && false && false && true && false && false && false && true && false) {long dpzdalcy = -873286555;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}