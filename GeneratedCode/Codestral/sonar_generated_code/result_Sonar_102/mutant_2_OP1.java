import java.util.Random;

class MyThread implements Runnable {
  Object lock = new Object();
  String deadStoreVar; // dead store mutant

  @Override
  public void run() {
    synchronized(lock) {
      deadStoreVar = generateRandomString(); // using the dead store variable
      lock.notify();  // Noncompliant, should be notifyAll()
    }
  }

  // Method to show the bug
  public void showBug() {
    Thread thread = new Thread(this);
    thread.start();
    try {
      // Waiting for the thread to be notified
      lock.wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  // Method to generate a random string of 8 characters
  private String generateRandomString() {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 8;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    return buffer.toString();
  }
}