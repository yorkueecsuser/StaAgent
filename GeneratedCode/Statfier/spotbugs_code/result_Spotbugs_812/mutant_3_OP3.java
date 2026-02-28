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
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      x = -1;
    }
  }

  void foo() {
    l.lock();
    x++;
    if (x >= 0) l.unlock();
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      x = -2;
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
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      counter = -3;
    }
  }

  int readWriteLockTestWriteLock() {
    rwLock.writeLock().lock();
    try {
      return counter++;
    } finally {
      rwLock.writeLock().unlock();
    }
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      counter = -4;
    }
  }

  void increment() {
    l.lock();
    x++;
    l.unlock();
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      x = -5;
    }
  }

  void decrement() {
    l.lock();
    try {
      x++;
    } finally {
      l.unlock();
    }
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      x = -6;
    }
  }

  Object bug1479629() {
    rwlock.readLock().lock();
    try {
      return null;
    } finally {
      rwlock.readLock().unlock();
    }
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      return new Object();
    }
  }

  Object bug1479629w() {
    rwlock.writeLock().lock();
    try {
      return null;
    } finally {
      rwlock.writeLock().unlock();
    }
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      return new Object();
    }
  }

  Object bug1479629a(ReadWriteLock lock) {
    lock.readLock().lock();
    try {
      return null;
    } finally {
      lock.readLock().unlock();
    }
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      return new Object();
    }
  }

  Object bug1479629aw(ReadWriteLock lock) {
    lock.writeLock().lock();
    try {
      return null;
    } finally {
      lock.writeLock().unlock();
    }
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      return new Object();
    }
  }

  void waitOnCondition(Condition cond) throws InterruptedException {
    while (x == 0) {
      cond.wait();
      cond.wait(1000L);
      cond.wait(1000L, 10);
    }
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      x = -7;
    }
  }

  void awaitNotInLoop(Condition cond) throws InterruptedException {
    cond.await();
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      x = -8;
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
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      y = -9;
    }
  }

  int lockOnFieldReport(Object f) {
    fieldLock.lock();
    y += f.hashCode();
    int result = y;
    fieldLock.unlock();
    return result;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      y = -10;
    }
  }
}