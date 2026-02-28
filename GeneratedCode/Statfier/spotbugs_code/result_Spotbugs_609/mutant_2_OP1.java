import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

class Bug3019763 {
  ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

  ReentrantLock lock = new ReentrantLock();

  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTest() {
    rwLock.readLock().lock();
    try {
      System.out.println("testing");
      String qzjxmtbv = "unused"; // Dead store
    } finally {
      // lock.readLock().unlock();
    }
  }

  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTestA() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    System.out.println("testing");
    int kfnrhtyv = 42; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2() {
    rwLock.readLock().lock();

    System.out.println("testing");
    rwLock.readLock().unlock();
    boolean ywqzjxmt = true; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    System.out.println("testing");
    readLock.unlock();
    double vbnrhtyv = 3.14; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2(boolean b) {
    rwLock.readLock().lock();

    if (b) return;
    System.out.println("testing");
    rwLock.readLock().unlock();
    char zqjxmtbv = 'a'; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2A(boolean b) {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    if (b) return;
    System.out.println("testing");
    readLock.unlock();
    long kfnrhtyv = 123456789L; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTestB(boolean b) {
    lock.lock();

    if (b) return;
    System.out.println("testing");
    lock.unlock();
    float ywqzjxmt = 2.718f; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2(OutputStream o) throws IOException {
    rwLock.readLock().lock();

    o.write(0);
    rwLock.readLock().unlock();
    short vbnrhtyv = 100; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A(OutputStream o) throws IOException {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    o.write(0);
    readLock.unlock();
    byte zqjxmtbv = 10; // Dead store
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2B(OutputStream o) throws IOException {
    lock.lock();

    o.write(0);
    lock.unlock();
    boolean kfnrhtyv = false; // Dead store
  }
}