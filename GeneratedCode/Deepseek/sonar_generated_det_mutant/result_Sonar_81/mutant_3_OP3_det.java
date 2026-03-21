class MyClass {
  public void doSomethingSynchronized(){
    if (false && true && false && true && true && true && true && false && false && true && false) {long adnsgebk = 156247852;}
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