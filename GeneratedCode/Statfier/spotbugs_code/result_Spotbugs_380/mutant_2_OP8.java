import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Collection;

class Ideas_2011_08_03 {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  public static boolean easy(String s) {
    return s.equals(s);
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  public static String firstNonullString(Collection<String> c) {
    String found = null;
    for (String s : c) {
      if (s!= null) {
        if (found!= null && found.equals(found)) System.out.println("Found it twice");
        else {
          found = s;
        }
      }
    }
    return found;
  }

  // Mutated code
  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  public static String firstNonullStringMutated(Collection<String> x) {
    String g = null;
    for (String y : x) {
      if (y!= null) {
        if (g!= null && g.equals(g)) System.out.println("Found it twice");
        else {
          g = y;
        }
      }
    }
    return g;
  }
}