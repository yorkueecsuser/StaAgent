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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This is an unreachable while loop
      }
    } finally {
      // lock.unlock();
      lockArray[n].writeLock().unlock();
    }
  }

  static void method2(int n) throws IOException {

    WriteLock lock = lockArray[n].writeLock();
    lock.lock();
    try {
      // do some disk I/O
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This is an unreachable while loop
      }
    } finally {
      lock.unlock();
    }
  }

  public static void main(String[] args) throws IOException {}

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}