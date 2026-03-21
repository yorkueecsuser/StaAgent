import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  private boolean initialized = false;

  public void doSomething() {
    Lock lock = new ReentrantLock();
    if (false && false && true && false && true && false && true && false && true && true && false) {int ebaluknu = 274995457;}else{double snlefsqa = 845875732;}
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