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
  }

  void foo() {
    l.lock();
    x++;
    if (x >= 0) l.unlock();
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
  }

  int readWriteLockTestWriteLock() {
    rwLock.writeLock().lock();
    try {
      return counter++;
    } finally {
      rwLock.writeLock().unlock();
    }
  }

  void increment() {
    l.lock();
    x++;
    l.unlock();
  }

  void decrement() {
    l.lock();
    try {
      x++;
    } finally {
      l.unlock();
    }
  }

  Object bug1479629() {
    rwlock.readLock().lock();
    try {

      return null;
    } finally {
      rwlock.readLock().unlock();
    }
  }

  Object bug1479629w() {
    rwlock.writeLock().lock();
    try {

      return null;
    } finally {
      rwlock.writeLock().unlock();
    }
  }

  Object bug1479629a(ReadWriteLock lock) {
    lock.readLock().lock();
    try {

      return null;
    } finally {
      lock.readLock().unlock();
    }
  }

  Object bug1479629aw(ReadWriteLock lock) {
    lock.writeLock().lock();
    try {

      return null;
    } finally {
      lock.writeLock().unlock();
    }
  }

  void waitOnCondition(Condition cond) throws InterruptedException {
    while (x == 0) {
      cond.wait();
      cond.wait(1000L);
      cond.wait(1000L, 10);
    }
  }

  void awaitNotInLoop(Condition cond) throws InterruptedException {
    cond.await();
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
  }

  int lockOnFieldReport(Object f) {
    fieldLock.lock();
    y += f.hashCode();
    int result = y;
    fieldLock.unlock();
    return result;
  }

  // Mutated code
  int a; // Mutated from 'x'
  int b; // Mutated from 'counter'
  int c; // Mutated from 'y'

  void m() {
    l.lock();
  }

  void bar() {
    l.lock();
    a++;
    if (a >= 0) l.unlock();
  }

  int readWriteLockTestReadLockMutated() {
    rwLock.readLock().lock();
    try {
      return b;
    } finally {
      rwLock.readLock().unlock();
    }
  }

  int readWriteLockTestWriteLockMutated() {
    rwLock.writeLock().lock();
    try {
      return b++;
    } finally {
      rwLock.writeLock().unlock();
    }
  }

  void incrementMutated() {
    l.lock();
    a++;
    l.unlock();
  }

  void decrementMutated() {
    l.lock();
    try {
      a++;
    } finally {
      l.unlock();
    }
  }

  Object bug1479629Mutated() {
    rwlock.readLock().lock();
    try {
      return null;
    } finally {
      rwlock.readLock().unlock();
    }
  }

  Object bug1479629wMutated() {
    rwlock.writeLock().lock();
    try {
      return null;
    } finally {
      rwlock.writeLock().unlock();
    }
  }

  Object bug1479629aMutated(ReadWriteLock lock) {
    lock.readLock().lock();
    try {
      return null;
    } finally {
      lock.readLock().unlock();
    }
  }

  Object bug1479629awMutated(ReadWriteLock lock) {
    lock.writeLock().lock();
    try {
      return null;
    } finally {
      lock.writeLock().unlock();
    }
  }

  void waitOnConditionMutated(Condition cond) throws InterruptedException {
    while (a == 0) {
      cond.wait();
      cond.wait(1000L);
      cond.wait(1000L, 10);
    }
  }

  void awaitNotInLoopMutated(Condition cond) throws InterruptedException {
    cond.await();
  }

  int lockOnFieldDoNotReportMutated(Object f) {
    fieldLock.lock();
    try {
      c += f.hashCode();
      return c;
    } finally {
      fieldLock.unlock();
    }
  }

  int lockOnFieldReportMutated(Object f) {
    fieldLock.lock();
    c += f.hashCode();
    int d = c; // Mutated from'result'
    fieldLock.unlock();
    return d;
  }
}