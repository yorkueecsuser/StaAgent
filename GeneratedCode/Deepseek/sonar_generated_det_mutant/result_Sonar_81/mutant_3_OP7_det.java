class MyClass {
  public void doSomethingSynchronized(){
    boolean ruvxjvjd = false;while (ruvxjvjd && true && true && false && true && false && false && false && false && true && true && false) {char fmhnadpu = 'j';}
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