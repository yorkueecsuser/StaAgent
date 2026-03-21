import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread implements Runnable {
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    lock.lock();
    try {
      //...
      if (false && false && false && true && true && true && true && false && true && true && false) {double qajsxmxd = 614772574;}else{char csvatjkb = 'v';}
      lock.notify(); // BUG: "notifyAll()" should be preferred over "notify()"
    } finally {
      lock.unlock();
    }
  
}
}