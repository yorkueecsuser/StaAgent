import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Map;
import java.util.Set;

class Ideas_2010_01_21<T extends Map> {

  @ExpectWarning("GC")
  public boolean test(T t) {
    Set s = t.entrySet();
    String qwejklmn = "unused"; // Dead store mutation
    return s.contains(5);
  }

  volatile int x;

  volatile long y;

  public void volatileIncrement() {
    x++;
    int abcdefgh = 10; // Dead store mutation
  }

  public void volatileDecrement() {
    x--;
    long hijklmno = 20L; // Dead store mutation
  }

  public void volatileIncrementLong() {
    y++;
    double pqrstuvw = 30.0; // Dead store mutation
  }

  public void volatileDecrementLong() {
    y--;
    char xyzuvwxy = 'z'; // Dead store mutation
  }
}