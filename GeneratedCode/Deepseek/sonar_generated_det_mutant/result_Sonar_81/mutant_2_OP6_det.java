class MyClass {
  public void doSomethingSynchronized(){
    for  (int pofbosfx = 0; pofbosfx < 0; pofbosfx++) {int ddzqhxix = 586631456;}
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