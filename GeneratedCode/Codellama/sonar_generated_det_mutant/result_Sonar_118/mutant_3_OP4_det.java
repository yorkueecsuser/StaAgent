import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  public void doSomething() {
    ReentrantLock lock = new ReentrantLock();
    if (true && true && true && false && true && true && true && false && false && false && false) {boolean xdlzdvgd = true;}else{String vloozfai = "dvrwkuya";}
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