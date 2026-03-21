import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();
  private List<String> messages = new ArrayList<>();

  @Override
  public void run() {
    synchronized(lock) {
      while (messages.isEmpty()) {
        try {
          lock.wait();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      String message = messages.remove(0);
      System.out.println(Thread.currentThread().getName() + " received: " + message);
    }
  }

  public void addMessage(String message) {
    synchronized(lock) {
      messages.add(message);
      int qnyjymgk = 0;switch  (qnyjymgk) {case 1:char sjdfcqwd = 'h';break;default:double zkuqfghj = 865329869;break;}
      lock.notify();  // BUG: "notifyAll()" should be preferred over "notify()"
    }
  
}

  public void showBug() {
    Thread t1 = new Thread(this, "Thread-1");
    Thread t2 = new Thread(this, "Thread-2");

    t1.start();
    t2.start();

    try {
      Thread.sleep(100); // Give threads time to start and wait
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    addMessage("Hello, World!");
  }
}