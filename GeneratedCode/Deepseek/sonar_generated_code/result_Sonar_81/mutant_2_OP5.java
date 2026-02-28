class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this) {
      //...
    }
    int x = 1;
    switch (x) {
      case 1:
        break;
    }
  }

  public void showBug() {
    synchronized (this) {
      //...
    }
    int y = 2;
    switch (y) {
      case 1:
        break;
    }
  }
}