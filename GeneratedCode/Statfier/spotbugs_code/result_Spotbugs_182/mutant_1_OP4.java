import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    return s.contains(5);

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable because condition is always false
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else block is unreachable
    return false;
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
}