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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  void foo() {
    l.lock();
    x++;
    if (x >= 0) l.unlock();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  int readWriteLockTestWriteLock() {
    rwLock.writeLock().lock();
    try {
      return counter++;
    } finally {
      rwLock.writeLock().unlock();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  void increment() {
    l.lock();
    x++;
    l.unlock();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  void decrement() {
    l.lock();
    try {
      x++;
    } finally {
      l.unlock();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  Object bug1479629() {
    rwlock.readLock().lock();
    try {
      return null;
    } finally {
      rwlock.readLock().unlock();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  Object bug1479629w() {
    rwlock.writeLock().lock();
    try {
      return null;
    } finally {
      rwlock.writeLock().unlock();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  Object bug1479629a(ReadWriteLock lock) {
    lock.readLock().lock();
    try {
      return null;
    } finally {
      lock.readLock().unlock();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  Object bug1479629aw(ReadWriteLock lock) {
    lock.writeLock().lock();
    try {
      return null;
    } finally {
      lock.writeLock().unlock();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  void waitOnCondition(Condition cond) throws InterruptedException {
    while (x == 0) {
      cond.wait();
      cond.wait(1000L);
      cond.wait(1000L, 10);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  void awaitNotInLoop(Condition cond) throws InterruptedException {
    cond.await();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  int lockOnFieldReport(Object f) {
    fieldLock.lock();
    y += f.hashCode();
    int result = y;
    fieldLock.unlock();
    return result;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}