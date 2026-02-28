import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyClass {
  private int counter = 0;

  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      for (int i = 0; i < 1000; i++) {
        counter++;
      }
    }
  }

  public int showBug() throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 10; i++) {
      executor.submit(this::doSomethingSynchronized);
    }
    executor.shutdown();
    executor.awaitTermination(1, TimeUnit.MINUTES);
    return counter;
  }
}

class SynchronizationBugDemo {
  public static void main(String[] args) throws InterruptedException {
    MyClass myClass = new MyClass();
    int result = myClass.showBug();
    System.out.println("Expected: 10000, Actual: " + result);
  }
}