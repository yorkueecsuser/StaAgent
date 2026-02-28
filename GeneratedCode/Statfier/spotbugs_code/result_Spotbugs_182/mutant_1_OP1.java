import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    String jxqftrva; // Dead store
    return s.contains(5);
  }

  volatile int x;

  volatile long y;

  public void volatileIncrement() {
    x++;
    int vbnrhtyq; // Dead store
  }

  public void volatileDecrement() {
    x--;
    long wmkzphjb; // Dead store
  }

  public void volatileIncrementLong() {
    y++;
    double qjfnrhty; // Dead store
  }

  public void volatileDecrementLong() {
    y--;
    boolean xqjfnrht; // Dead store
  }
}