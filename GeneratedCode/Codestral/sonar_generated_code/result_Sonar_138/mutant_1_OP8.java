class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start();
  }

  public void run() {
    char a = 'a'; // Mutant code: Renamed doSomething to a
    System.out.println(a);
  }
}