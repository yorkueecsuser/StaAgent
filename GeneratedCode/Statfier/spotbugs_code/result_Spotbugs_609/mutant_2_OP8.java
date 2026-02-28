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

  // Mutated code starts here

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
  public void doTestAC() {
    ReadLock y = rwLock.readLock();
    y.lock();

    System.out.println("testing");
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2C() {
    ReentrantReadWriteLock z = new ReentrantReadWriteLock();
    z.readLock().lock();

    System.out.println("testing");
    z.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2AC() {
    ReadLock a = rwLock.readLock();
    a.lock();

    System.out.println("testing");
    a.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2C(boolean c) {
    ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    d.readLock().lock();

    if (c) return;
    System.out.println("testing");
    d.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2AC(boolean e) {
    ReadLock f = rwLock.readLock();
    f.lock();

    if (e) return;
    System.out.println("testing");
    f.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTestBC(boolean g) {
    ReentrantLock h = new ReentrantLock();
    h.lock();

    if (g) return;
    System.out.println("testing");
    h.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2C(OutputStream i) throws IOException {
    ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    j.readLock().lock();

    i.write(0);
    j.readLock().unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2AC(OutputStream k) throws IOException {
    ReadLock l = rwLock.readLock();
    l.lock();

    k.write(0);
    l.unlock();
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2BC(OutputStream m) throws IOException {
    ReentrantLock n = new ReentrantLock();
    n.lock();

    m.write(0);
    n.unlock();
  }
}