import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    s = t.entrySet(); // Duplicate assignment statement
    return s.contains(5);
  }

  volatile int x;

  volatile long y;

  public void volatileIncrement() {
    x++;
    x++; // Duplicate assignment statement
  }

  public void volatileDecrement() {
    x--;
    x--; // Duplicate assignment statement
  }

  public void volatileIncrementLong() {
    y++;
    y++; // Duplicate assignment statement
  }

  public void volatileDecrementLong() {
    y--;
    y--; // Duplicate assignment statement
  }
}