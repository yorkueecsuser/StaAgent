import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

class Bug2033091 {

  static ReentrantReadWriteLock lockArray[];

  static {
    lockArray = new ReentrantReadWriteLock[5];
    for (int i = 0; i < lockArray.length; i++) lockArray[i] = new ReentrantReadWriteLock();
  }

  static void falsePositive(int n) throws IOException {

    // WriteLock lock = lockArray[n].writeLock();
    // lock.lock();
    lockArray[n].writeLock().lock();
    try {
      // do some disk I/O
    } finally {
      // lock.unlock();
      lockArray[n].writeLock().unlock();
    }

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block in falsePositive");
    }
  }

  static void method2(int n) throws IOException {

    WriteLock lock = lockArray[n].writeLock();
    lock.lock();
    try {
      // do some disk I/O
    } finally {
      lock.unlock();
    }

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block in method2");
    }
  }

  public static void main(String[] args) throws IOException {}

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // Always returns true to ensure the if block is reachable
  }
}