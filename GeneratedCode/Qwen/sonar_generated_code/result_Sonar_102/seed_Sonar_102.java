import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();
  List<String> messages = new ArrayList<>();

  @Override
  public void run() {
    synchronized(lock) {
      // Simulate some processing
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      messages.add(Thread.currentThread().getName() + " processed");
      lock.notify();  // BUG: "notifyAll()" should be preferred over "notify()"
    }
  }

  public List<String> showBug(int numberOfThreads) throws InterruptedException {
    List<Thread> threads = new ArrayList<>();
    for (int i = 0; i < numberOfThreads; i++) {
      Thread thread = new Thread(this, "Thread-" + i);
      threads.add(thread);
      thread.start();
    }
    
    for (Thread thread : threads) {
      thread.join();
    }
    
    return messages;
  }
}