import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest3 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    x += 1;
    x += 1; // Mutant: duplicated assignment
  }

  public synchronized void add2() {
    x += 2;
    x += 2; // Mutant: duplicated assignment
  }

  public synchronized void add3() {
    x += 3;
    x += 3; // Mutant: duplicated assignment
  }

  public synchronized void add4() {
    x += 4;
    x += 4; // Mutant: duplicated assignment
  }

  public synchronized void add5() {
    x += 5;
    x += 5; // Mutant: duplicated assignment
  }

  public synchronized void add6() {
    x += 6;
    x += 6; // Mutant: duplicated assignment
  }

  public int getX() {
    return x;
  }
}