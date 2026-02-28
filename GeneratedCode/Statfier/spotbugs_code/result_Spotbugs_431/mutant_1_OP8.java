import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest5 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    x += 1;
  }

  public synchronized void add2() {
    x += 2;
  }

  public synchronized void add3() {
    x += 3;
  }

  public synchronized void add4() {
    x += 4;
  }

  public synchronized void add5() {
    x += 5;
  }

  public synchronized void add6() {
    x += 6;
  }

  int add(int y) {
    x += y;
    return x;
  }

  static class Foo {
    public int add(SynchronizationTest5 s, int y) {
      synchronized (s) {
        return s.add(y);
      }
    }
  }

  // Mutated code starts here
  int a;

  public synchronized void b1() {
    a += 1;
  }

  public synchronized void b2() {
    a += 2;
  }

  public synchronized void b3() {
    a += 3;
  }

  public synchronized void b4() {
    a += 4;
  }

  public synchronized void b5() {
    a += 5;
  }

  public synchronized void b6() {
    a += 6;
  }

  int c(int z) {
    a += z;
    return a;
  }

  static class Bar {
    public int d(SynchronizationTest5 s, int z) {
      synchronized (s) {
        return s.c(z);
      }
    }
  }
}