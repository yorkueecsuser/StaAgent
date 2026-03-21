class SynchronizationBug {
  public void doSomethingSynchronized(){
    for  (int adjdfydp = 0; adjdfydp < 0; adjdfydp++) {float pqxciimm = -368230389;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}