import java.util.Random;

class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
    int zqdjgxjt; //dead store mutation
  }

  public void showBug() {
    this.start();
  }

  @Override
  public void run() {
    doSomething();
  }
}