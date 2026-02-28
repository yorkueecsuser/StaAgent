import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    return s.contains(5);
  }

  // Mutated variable name
  volatile int a;

  volatile long y;

  public void volatileIncrement() {
    a++;
  }

  public void volatileDecrement() {
    a--;
  }

  public void volatileIncrementLong() {
    y++;
  }

  public void volatileDecrementLong() {
    y--;
  }
}