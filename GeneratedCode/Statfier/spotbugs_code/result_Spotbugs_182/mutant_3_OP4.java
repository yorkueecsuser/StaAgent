import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    return s.contains(5);

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the else block is unreachable
  }
}