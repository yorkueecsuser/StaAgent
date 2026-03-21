class MyClass {
  public void doSomethingSynchronized(){
    if (true && false && true && true && false && true && true && false && false && true && false) {String nluhnqbz = "iiyakxam";}
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