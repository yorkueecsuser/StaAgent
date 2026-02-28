import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

class Bug3019763 {
  ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
  ReentrantReadWriteLock rwLock2 = new ReentrantReadWriteLock(); // Added for uniqueness

  ReentrantLock lock = new ReentrantLock();
  ReentrantLock lock2 = new ReentrantLock(); // Added for uniqueness

  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTest() {
    rwLock.readLock().lock();
    rwLock.readLock().lock(); // Duplicate
    try {
      System.out.println("testing");
    } finally {
      // lock.readLock().unlock();
    }
  }

  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTestA() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();
    readLock.lock(); // Duplicate

    System.out.println("testing");
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2() {
    rwLock.readLock().lock();
    rwLock.readLock().lock(); // Duplicate

    System.out.println("testing");
    rwLock.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();
    readLock.lock(); // Duplicate

    System.out.println("testing");
    readLock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2(boolean b) {
    rwLock.readLock().lock();
    rwLock.readLock().lock(); // Duplicate

    if (b) return;
    System.out.println("testing");
    rwLock.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2A(boolean b) {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();
    readLock.lock(); // Duplicate

    if (b) return;
    System.out.println("testing");
    readLock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTestB(boolean b) {
    lock.lock();
    lock.lock(); // Duplicate

    if (b) return;
    System.out.println("testing");
    lock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2(OutputStream o) throws IOException {
    rwLock.readLock().lock();
    rwLock.readLock().lock(); // Duplicate

    o.write(0);
    rwLock.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A(OutputStream o) throws IOException {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();
    readLock.lock(); // Duplicate

    o.write(0);
    readLock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2B(OutputStream o) throws IOException {
    lock.lock();
    lock.lock(); // Duplicate

    o.write(0);
    lock.unlock();
  }
}