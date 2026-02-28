class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start();
    insertUnreachableSwitchStatement();
  }

  private void insertUnreachableSwitchStatement() {
    int value = getUnreachableValue(); // This value should always be out of switch case range to make it unreachable
    switch(value) {
      case 1:
        System.out.println("Unreachable code");
        break;
      default:
        // Do nothing
    }
  }

  private int getUnreachableValue() {
    return Integer.MAX_VALUE; // Always return a value out of case range
  }
}