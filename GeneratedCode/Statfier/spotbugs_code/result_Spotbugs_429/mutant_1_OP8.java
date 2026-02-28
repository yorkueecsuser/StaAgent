import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest3 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
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

  public int getX() {
    return x;
  }

  // Mutated code
  int y;

  public synchronized void update1() {
    y += 1;
  }

  public synchronized void update2() {
    y += 2;
  }

  public synchronized void update3() {
    y += 3;
  }

  public synchronized void update4() {
    y += 4;
  }

  public synchronized void update5() {
    y += 5;
  }

  public synchronized void update6() {
    y += 6;
  }

  public int getY() {
    return y;
  }
}