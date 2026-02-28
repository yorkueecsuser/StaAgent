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
    } finally {
      // lock.readLock().unlock();
    }
  }

  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTestA() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    System.out.println("testing");
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2() {
    rwLock.readLock().lock();

    System.out.println("testing");
    rwLock.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    System.out.println("testing");
    readLock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2(boolean b) {
    rwLock.readLock().lock();

    if (b) return;
    System.out.println("testing");
    rwLock.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2A(boolean b) {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    if (b) return;
    System.out.println("testing");
    readLock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTestB(boolean b) {
    lock.lock();

    if (b) return;
    System.out.println("testing");
    lock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2(OutputStream o) throws IOException {
    rwLock.readLock().lock();

    o.write(0);
    rwLock.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A(OutputStream o) throws IOException {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    o.write(0);
    readLock.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2B(OutputStream o) throws IOException {
    lock.lock();

    o.write(0);
    lock.unlock();
  }

  // Mutated code
  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTestC() {
    ReentrantReadWriteLock x = new ReentrantReadWriteLock();
    x.readLock().lock();
    try {
      System.out.println("testing");
    } finally {
      // x.readLock().unlock();
    }
  }

  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTestAa() {
    ReadLock y = rwLock.readLock();
    y.lock();

    System.out.println("testing");
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2c() {
    ReentrantReadWriteLock z = new ReentrantReadWriteLock();
    z.readLock().lock();

    System.out.println("testing");
    z.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2Aa() {
    ReadLock a = rwLock.readLock();
    a.lock();

    System.out.println("testing");
    a.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2c(boolean b) {
    ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    c.readLock().lock();

    if (b) return;
    System.out.println("testing");
    c.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2Aa(boolean b) {
    ReadLock d = rwLock.readLock();
    d.lock();

    if (b) return;
    System.out.println("testing");
    d.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTestBb(boolean b) {
    ReentrantLock e = new ReentrantLock();
    e.lock();

    if (b) return;
    System.out.println("testing");
    e.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2(OutputStream f) throws IOException {
    ReentrantReadWriteLock g = new ReentrantReadWriteLock();
    g.readLock().lock();

    f.write(0);
    g.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2Aa(OutputStream h) throws IOException {
    ReadLock i = rwLock.readLock();
    i.lock();

    h.write(0);
    i.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2Bb(OutputStream j) throws IOException {
    ReentrantLock k = new ReentrantLock();
    k.lock();

    j.write(0);
    k.unlock();
  }
}