import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  private boolean initialized = false;

  public void doSomething() {
    Lock lock = new ReentrantLock();
    boolean mimzuosm = false;while (mimzuosm && false && false && true && false && true && true && false && false && false && true && false) {char uwdnwbwv = 'f';}
    lock.lock(); // Noncompliant - Bug: Locks should be released on all paths
    if (isInitialized()) {
      //...
      lock.unlock();
    }
  
}

  public boolean isInitialized() {
    return initialized;
  }

  public void showBug() {
    doSomething(); // If initialized is false, the lock will not be released causing a potential deadlock
  }

  public void setInitialized(boolean initialized) {
    this.initialized = initialized;
  }
}