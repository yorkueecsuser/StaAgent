import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class JSR166 {
  Lock l = new ReentrantLock();

  ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();

  int x;

  void l() {
    l.lock();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void foo() {
    l.lock();
    x++;
    if (x >= 0) l.unlock();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  ReadWriteLock rwLock = new ReentrantReadWriteLock();

  int counter;

  int readWriteLockTestReadLock() {
    rwLock.readLock().lock();
    try {
      return counter;
    } finally {
      rwLock.readLock().unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  int readWriteLockTestWriteLock() {
    rwLock.writeLock().lock();
    try {
      return counter++;
    } finally {
      rwLock.writeLock().unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void increment() {
    l.lock();
    x++;
    l.unlock();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void decrement() {
    l.lock();
    try {
      x++;
    } finally {
      l.unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  Object bug1479629() {
    rwlock.readLock().lock();
    try {
      return null;
    } finally {
      rwlock.readLock().unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  Object bug1479629w() {
    rwlock.writeLock().lock();
    try {
      return null;
    } finally {
      rwlock.writeLock().unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  Object bug1479629a(ReadWriteLock lock) {
    lock.readLock().lock();
    try {
      return null;
    } finally {
      lock.readLock().unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  Object bug1479629aw(ReadWriteLock lock) {
    lock.writeLock().lock();
    try {
      return null;
    } finally {
      lock.writeLock().unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void waitOnCondition(Condition cond) throws InterruptedException {
    while (x == 0) {
      cond.wait();
      cond.wait(1000L);
      cond.wait(1000L, 10);
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void awaitNotInLoop(Condition cond) throws InterruptedException {
    cond.await();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  final Lock fieldLock = new ReentrantLock();

  int y;

  int lockOnFieldDoNotReport(Object f) {
    fieldLock.lock();
    try {
      y += f.hashCode();
      return y;
    } finally {
      fieldLock.unlock();
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  int lockOnFieldReport(Object f) {
    fieldLock.lock();
    y += f.hashCode();
    int result = y;
    fieldLock.unlock();
    return result;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}