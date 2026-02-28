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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }

  public static void main(String[] args) throws IOException {}
}