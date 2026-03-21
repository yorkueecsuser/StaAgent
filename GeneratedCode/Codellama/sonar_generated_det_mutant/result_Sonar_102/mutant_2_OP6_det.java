import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread implements Runnable {
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    lock.lock();
    try {
      //...
      for  (int wbeaigjh = 0; wbeaigjh < 0; wbeaigjh++) {char gouorkry = 'n';}
      lock.notify(); // BUG: "notifyAll()" should be preferred over "notify()"
    } finally {
      lock.unlock();
    }
  
}
}