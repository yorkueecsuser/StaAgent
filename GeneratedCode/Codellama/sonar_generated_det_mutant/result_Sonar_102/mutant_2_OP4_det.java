import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread implements Runnable {
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    lock.lock();
    try {
      //...
      if (false && true && false && true && false && true && true && true && true && false && false) {char zpzcknnj = 'c';}else{long ldmlxvgn = 745078041;}
      lock.notify(); // BUG: "notifyAll()" should be preferred over "notify()"
    } finally {
      lock.unlock();
    }
  
}
}