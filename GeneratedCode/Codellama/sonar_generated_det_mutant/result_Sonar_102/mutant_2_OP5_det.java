import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread implements Runnable {
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    lock.lock();
    try {
      //...
      int qiohehyi = 0;switch  (qiohehyi) {case 1:int dezxfppd = 631424834;break;default:byte ngrfvzbm = -66;break;}
      lock.notify(); // BUG: "notifyAll()" should be preferred over "notify()"
    } finally {
      lock.unlock();
    }
  
}
}