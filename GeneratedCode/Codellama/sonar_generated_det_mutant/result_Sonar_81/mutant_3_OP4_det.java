class SynchronizationBug {
  public void doSomethingSynchronized(){
    if (true && true && false && false && true && false && true && false && true && true && false) {boolean uqkxhweq = true;}else{boolean jlzyqhtd = true;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}