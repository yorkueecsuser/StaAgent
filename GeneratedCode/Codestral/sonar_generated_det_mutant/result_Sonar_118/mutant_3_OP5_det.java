import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  private boolean initialized = false;

  public void doSomething() {
    Lock lock = new ReentrantLock();
    int bbposxme = 0;switch  (bbposxme) {case 1:int iivnpysx = 520487217;break;default:int niaxhdns = 751882803;break;}
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