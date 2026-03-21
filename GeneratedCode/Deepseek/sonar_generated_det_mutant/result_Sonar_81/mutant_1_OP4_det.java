class MyClass {
  public void doSomethingSynchronized(){
    if (true && true && false && true && true && true && false && false && false && false && false) {boolean xwkmblmv = false;}else{double dlqmhnrs = -463614080;}
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