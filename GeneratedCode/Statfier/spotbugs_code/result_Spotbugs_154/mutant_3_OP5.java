import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Random;
import javax.annotation.CheckForNull;

class Ideas_2012_11_15 {

  Random r = new Random();

  public @CheckForNull Object get() {
    if (r.nextBoolean()) return "x";
    return null;
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  @NoWarning("NP_GUARANTEED_DEREF")
  public int f(int i) {

    Object x = get();

    // Introducing an unreachable switch statement
    boolean unreachableCondition = r.nextInt(2) > 2; // This will always be false
    switch (unreachableCondition? 1 : 0) {
      case 1:
        System.out.println("This is an unreachable case");
        break;
      case 0:
        System.out.println("This is also unreachable");
        break;
    }

    if (i > 0) return x.hashCode();
    else return -x.hashCode();
  }
}