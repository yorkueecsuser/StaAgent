class MyClass {
  public void doSomethingSynchronized(){
    if (false && true && true && false && false && false && false && true && false && true && false) {float pcbhanan = -845651135;}else{int mvsimppv = 357145824;}
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