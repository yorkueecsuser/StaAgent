class MyClass {
  private final Object lock = new Object();

  public void doSomethingSynchronized() {
    synchronized (lock) {
      //...
    }
  }

  public void showBug() {
    synchronized (lock) {  
      //...
    }
  }
}