class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {
      //...
    }
  }

  public void showBug() {
    synchronized (this.getClass()) {
      //...
    }
    synchronized (this.getClass()) {  // Duplicated synchronized block
      // Duplicated code...
    }
  }
}