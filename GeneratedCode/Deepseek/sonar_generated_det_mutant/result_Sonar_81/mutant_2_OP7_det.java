class MyClass {
  public void doSomethingSynchronized(){
    boolean nfsyxdih = false;while (nfsyxdih && true && true && false && true && false && false && false && true && false && true && false) {byte qjdhqfqg = -115;}
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void doSomethingSynchronizedCompliant(){
    synchronized (MyClass.class) {
      //...
    }
  }

  public void showBug() {
    doSomethingSynchronized();
  }
}