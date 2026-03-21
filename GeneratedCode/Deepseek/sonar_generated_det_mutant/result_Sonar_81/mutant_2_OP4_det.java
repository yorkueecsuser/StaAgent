class MyClass {
  public void doSomethingSynchronized(){
    if (false && false && true && true && true && false && false && true && true && true && false) {double vmqcomgq = -320079176;}else{char dbkuqucu = 'k';}
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