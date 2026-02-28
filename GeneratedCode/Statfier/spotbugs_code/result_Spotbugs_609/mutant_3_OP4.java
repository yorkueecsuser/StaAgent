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
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @NoWarning("UL_UNRELEASED_LOCK")
  public void doTestA() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    System.out.println("testing");
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2() {
    rwLock.readLock().lock();

    System.out.println("testing");
    rwLock.readLock().unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A() {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    System.out.println("testing");
    readLock.unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2(boolean b) {
    rwLock.readLock().lock();

    if (b) return;
    System.out.println("testing");
    rwLock.readLock().unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTest2A(boolean b) {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    if (b) return;
    System.out.println("testing");
    readLock.unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK")
  public void doTestB(boolean b) {
    lock.lock();

    if (b) return;
    System.out.println("testing");
    lock.unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2(OutputStream o) throws IOException {
    rwLock.readLock().lock();

    o.write(0);
    rwLock.readLock().unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2A(OutputStream o) throws IOException {
    ReadLock readLock = rwLock.readLock();
    readLock.lock();

    o.write(0);
    readLock.unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  public void doTest2B(OutputStream o) throws IOException {
    lock.lock();

    o.write(0);
    lock.unlock();
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for the unreachable code
    } else {
      // This is the unreachable if-else branch
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}