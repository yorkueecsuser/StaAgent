import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    x += 1;
    String abcdefgh = "deadstore1"; // Dead store mutation
  }

  public synchronized void add2() {
    x += 2;
  }

  public synchronized void add3() {
    x += 3;
    int hijklmno = 12345; // Dead store mutation
  }

  public synchronized void add4() {
    x += 4;
  }

  public synchronized void add5() {
    x += 5;
    boolean pqrstuvw = true; // Dead store mutation
  }

  public synchronized void add6() {
    x += 6;
  }

  public int get2X() {
    return x + x;
    char xyzabcde = 'a'; // Dead store mutation
  }
}