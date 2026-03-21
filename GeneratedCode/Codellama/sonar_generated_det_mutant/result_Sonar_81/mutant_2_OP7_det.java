class SynchronizationBug {
  public void doSomethingSynchronized(){
    boolean yqdxbtre = false;while (yqdxbtre && false && true && true && false && true && false && false && false && false && true && false) {String nldsjlra = "xwsrebwd";}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}