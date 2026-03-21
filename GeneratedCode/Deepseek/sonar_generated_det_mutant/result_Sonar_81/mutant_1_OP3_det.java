class MyClass {
  public void doSomethingSynchronized(){
    if (false && false && false && false && false && true && true && false && true && false && false) {String fadhtxye = "lfhkcqrz";}
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