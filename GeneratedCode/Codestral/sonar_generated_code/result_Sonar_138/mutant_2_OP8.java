class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start();
  }

  @Override
  public void run() {
    char a = 'a'; // Mutated code: Renaming 'doSomething' to 'a'
    this.a(); // Call the renamed method
  }
}