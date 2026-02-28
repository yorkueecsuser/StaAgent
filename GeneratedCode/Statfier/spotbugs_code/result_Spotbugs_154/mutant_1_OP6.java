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

    // Inserting an unreachable for loop
    boolean conditionFor = r.nextBoolean() && false; // This ensures the loop is unreachable
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }

    if (i > 0) return x.hashCode();
    else return -x.hashCode();
  }
}