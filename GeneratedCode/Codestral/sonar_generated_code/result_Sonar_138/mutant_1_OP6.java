class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    // Added unreachable for loop as per the mutation operator information
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      System.out.println("This line will never be executed.");
    }

    this.start(); // This will not print anything as the run method is not overridden
  }
}