class MyClass {
  public void doSomethingSynchronized(){
    boolean afnqnvom = false;while (afnqnvom && true && false && true && true && true && true && true && false && true && false && false) {double zdngtsvc = 709729464;}
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