import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  private boolean initialized = false;

  public void doSomething() {
    Lock lock = new ReentrantLock();
    if (false && false && true && false && false && true && true && true && true && false && false) {boolean jsriyvlj = false;}else{short zkmnwdfq = 7599;}
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