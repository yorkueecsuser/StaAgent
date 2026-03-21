class MyClass {
  public void doSomethingSynchronized(){
    for  (int lpqvxemu = 0; lpqvxemu < 0; lpqvxemu++) {long iinngjlv = -644372952;}
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