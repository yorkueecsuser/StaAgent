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
  int a;
  void b() {
    l.lock();
    a++;
    if (a >= 0) l.unlock();
  }

  int c;
  int d() {
    rwLock.readLock().lock();
    try {
      return c;
    } finally {
      rwLock.readLock().unlock();
    }
  }

  int e;
  int f() {
    rwLock.writeLock().lock();
    try {
      return e++;
    } finally {
      rwLock.writeLock().unlock();
    }
  }

  void g() {
    l.lock();
    a++;
    l.unlock();
  }

  void h() {
    l.lock();
    try {
      a++;
    } finally {
      l.unlock();
    }
  }

  Object i() {
    rwlock.readLock().lock();
    try {
      return null;
    } finally {
      rwlock.readLock().unlock();
    }
  }

  Object j() {
    rwlock.writeLock().lock();
    try {
      return null;
    } finally {
      rwlock.writeLock().unlock();
    }
  }

  Object k(ReadWriteLock lock) {
    lock.readLock().lock();
    try {
      return null;
    } finally {
      lock.readLock().unlock();
    }
  }

  Object m(ReadWriteLock lock) {
    lock.writeLock().lock();
    try {
      return null;
    } finally {
      lock.writeLock().unlock();
    }
  }

  void n(Condition cond) throws InterruptedException {
    while (a == 0) {
      cond.wait();
      cond.wait(1000L);
      cond.wait(1000L, 10);
    }
  }

  void o(Condition cond) throws InterruptedException {
    cond.await();
  }

  final Lock p = new ReentrantLock();

  int q;

  int r(Object f) {
    p.lock();
    try {
      q += f.hashCode();
      return q;
    } finally {
      p.unlock();
    }
  }

  int s(Object f) {
    p.lock();
    q += f.hashCode();
    int t = q;
    p.unlock();
    return t;
  }
}