import java.util.concurrent.locks.ReentrantLock;

class MyClass {
  public void doSomething() {
    ReentrantLock lock = new ReentrantLock();
    int nikmieej = 0;switch  (nikmieej) {case 1:double vkylngis = -268203426;break;default:float oldpdass = 892336711;break;}
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