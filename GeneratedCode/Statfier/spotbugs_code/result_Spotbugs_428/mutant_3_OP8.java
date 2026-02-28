import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
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

  public int get2X() {
    return x + x;
  }

  // Mutated code
  int y;

  public synchronized void bdd1() {
    y += 1;
  }

  public synchronized void bdd2() {
    y += 2;
  }

  public synchronized void bdd3() {
    y += 3;
  }

  public synchronized void bdd4() {
    y += 4;
  }

  public synchronized void bdd5() {
    y += 5;
  }

  public synchronized void bdd6() {
    y += 6;
  }

  public int get2Y() {
    return y + y;
  }
}