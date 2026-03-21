import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  public void doSomething() {
    ReentrantLock lock = new ReentrantLock();
    int ilbutvkz = 0;switch  (ilbutvkz) {case 1:boolean ovvsyzpk = false;break;default:char nalmssbi = 'd';break;}
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