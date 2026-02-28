import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest5 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    x += 1;
    String abcdefgh = "unused"; // Dead store
  }

  public synchronized void add2() {
    x += 2;
  }

  public synchronized void add3() {
    x += 3;
    int hijklmno = 42; // Dead store
  }

  public synchronized void add4() {
    x += 4;
  }

  public synchronized void add5() {
    x += 5;
    boolean pqrstuvw = true; // Dead store
  }

  public synchronized void add6() {
    x += 6;
  }

  int add(int y) {
    x += y;
    return x;
    char xyzabcde = 'z'; // Dead store
  }

  static class Foo {
    public int add(SynchronizationTest5 s, int y) {
      synchronized (s) {
        return s.add(y);
        double fghijklm = 3.14; // Dead store
      }
    }
  }
}