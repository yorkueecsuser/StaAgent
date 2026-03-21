import java.util.concurrent.locks.ReentrantLock;

class MyClass {
public void doSomething() {
    ReentrantLock lock = new ReentrantLock();
    lock = new ReentrantLock();
    lock.lock();
    if(isInitialized()){ lock.unlock(); }
}

  public void showBug() {
    doSomething();
  }
}