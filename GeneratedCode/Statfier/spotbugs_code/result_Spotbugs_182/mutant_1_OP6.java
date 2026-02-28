import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    return s.contains(5);

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  volatile int x;

  volatile long y;

  public void volatileIncrement() {
    x++;

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  public void volatileDecrement() {
    x--;

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  public void volatileIncrementLong() {
    y++;

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  public void volatileDecrementLong() {
    y--;

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}