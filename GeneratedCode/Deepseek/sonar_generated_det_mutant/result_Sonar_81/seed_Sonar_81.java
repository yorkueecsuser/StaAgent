class MyClass {
  public void doSomethingSynchronized(){
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