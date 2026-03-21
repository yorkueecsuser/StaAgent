import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  public void doSomething() {
    ReentrantLock lock = new ReentrantLock();
    boolean ebpbbvdj = false;while (ebpbbvdj && true && true && true && true && true && true && false && true && false && false && false) {double ipiwvbor = -826695789;}
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