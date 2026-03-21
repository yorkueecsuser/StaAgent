import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  public void doSomething() {
    ReentrantLock lock = new ReentrantLock();
    long xmaimyhs = 235789333;
    lock.lock(); // BUG: Locks should be released on all paths
    if (isInitialized()) {
      //...
      lock.unlock();
    }
  
}

  public void showBug() {
    doSomething();
  }
}