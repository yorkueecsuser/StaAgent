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

  // Mutated code
  int q; // Renamed variable 'x' to 'q'

  public synchronized void bdd1() { // Renamed method 'add1' to 'bdd1'
    q += 1;
  }

  public synchronized void bdd2() { // Renamed method 'add2' to 'bdd2'
    q += 2;
  }

  public synchronized void bdd3() { // Renamed method 'add3' to 'bdd3'
    q += 3;
  }

  public synchronized void bdd4() { // Renamed method 'add4' to 'bdd4'
    q += 4;
  }

  public synchronized void bdd5() { // Renamed method 'add5' to 'bdd5'
    q += 5;
  }

  public synchronized void bdd6() { // Renamed method 'add6' to 'bdd6'
    q += 6;
  }

  int bdd(int z) { // Renamed method 'add' to 'bdd' and parameter 'y' to 'z'
    q += z;
    return q;
  }

  static class Bar { // Renamed class 'Foo' to 'Bar'
    public int bdd(SynchronizationTest5 s, int z) { // Renamed method 'add' to 'bdd' and parameter 'y' to 'z'
      synchronized (s) {
        return s.bdd(z);
      }
    }
  }
}