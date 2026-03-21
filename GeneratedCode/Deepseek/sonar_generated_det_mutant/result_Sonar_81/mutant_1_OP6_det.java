class MyClass {
  public void doSomethingSynchronized(){
    for  (int wqqsddwl = 0; wqqsddwl < 0; wqqsddwl++) {char wggbjsnn = 'a';}
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