import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

class Bug2033091 {

  static ReentrantReadWriteLock lockArray[];

  static {
    lockArray = new ReentrantReadWriteLock[5];
    for (int i = 0; i < lockArray.length; i++) lockArray[i] = new ReentrantReadWriteLock();
    lockArray = new ReentrantReadWriteLock[5]; // Mutant: Duplicate assignment
  }

  static void falsePositive(int n) throws IOException {

    // WriteLock lock = lockArray[n].writeLock();
    // lock.lock();
    lockArray[n].writeLock().lock();
    lockArray[n].writeLock().lock(); // Mutant: Duplicate assignment
    try {
      // do some disk I/O
    } finally {
      // lock.unlock();
      lockArray[n].writeLock().unlock();
      lockArray[n].writeLock().unlock(); // Mutant: Duplicate assignment
    }
  }

  static void method2(int n) throws IOException {

    WriteLock lock = lockArray[n].writeLock();
    lock = lockArray[n].writeLock(); // Mutant: Duplicate assignment
    lock.lock();
    try {
      // do some disk I/O
    } finally {
      lock.unlock();
      lock = lockArray[n].writeLock(); // Mutant: Duplicate assignment
    }
  }

  public static void main(String[] args) throws IOException {}
}