import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread implements Runnable {
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    lock.lock();
    try {
      //...
      for  (int odhivzds = 0; odhivzds < 0; odhivzds++) {double hzyozwhm = -849829430;}
      lock.notify(); // BUG: "notifyAll()" should be preferred over "notify()"
    } finally {
      lock.unlock();
    }
  
}
}