import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    return s.contains(5);
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }

  volatile int x;

  volatile long y;

  public void volatileIncrement() {
    x++;
    // Dead Store Mutation
    int hijklmno = 42;
  }

  public void volatileDecrement() {
    x--;
    // Dead Store Mutation
    double pqrstuvw = 3.14;
  }

  public void volatileIncrementLong() {
    y++;
    // Dead Store Mutation
    char xyzabcde = 'z';
  }

  public void volatileDecrementLong() {
    y--;
    // Dead Store Mutation
    boolean fghijklm = true;
  }
}