import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  private boolean initialized;

  public MyClass(boolean initialized) {
    this.initialized = initialized;
  }

  private boolean isInitialized() {
    return initialized;
  }

  public void doSomething() {
    Lock lock = new ReentrantLock();
    lock.lock(); // BUG: Locks should be released on all paths
    if (isInitialized()) {
      // Simulate some work
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      lock.unlock();
    }
  }

  public String showBug() {
    try {
      doSomething();
      return "Lock was not released on all paths";
    } catch (Exception e) {
      return "Exception occurred: " + e.getMessage();
    }
  }

  public static void main(String[] args) {
    MyClass myClass = new MyClass(true);
    System.out.println(myClass.showBug());
  }
}