import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    return s.contains(5);
  }

  volatile int x;

  volatile long y;

  public void volatileIncrement() {
    x++;
  }

  public void volatileDecrement() {
    x--;
  }

  public void volatileIncrementLong() {
    y++;
  }

  public void volatileDecrementLong() {
    y--;
  }

  // Mutated code
  @ExpectWarning("GC")
  public boolean test(b b) {
    Set a = b.entrySet();
    return a.contains(5);
  }

  volatile int z;

  volatile long w;

  public void volatileIncrementZ() {
    z++;
  }

  public void volatileDecrementZ() {
    z--;
  }

  public void volatileIncrementLongW() {
    w++;
  }

  public void volatileDecrementLongW() {
    w--;
  }
}