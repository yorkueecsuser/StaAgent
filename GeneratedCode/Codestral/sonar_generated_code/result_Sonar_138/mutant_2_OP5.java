class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    int value = neverReachesOne();
    switch(value) {
      case 1:
        System.out.println("Unreachable code block!"); // This block is actually unreachable
        break;
      default:
        this.start();
        break;
    }
  }

  private int neverReachesOne() {
    return 2; // This method always returns a value other than 1
  }
}