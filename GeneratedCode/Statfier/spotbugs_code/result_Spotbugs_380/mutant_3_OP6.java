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
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return found;
  }

  private static boolean getCondition() {
    return false;
  }
}