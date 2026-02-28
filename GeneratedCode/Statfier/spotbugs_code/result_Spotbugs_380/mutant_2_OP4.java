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
        // Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is unreachable");
        } else {
          System.out.println("This is also unreachable");
        }

        if (found!= null && found.equals(found)) System.out.println("Found it twice");
        else {
          found = s;
        }
      }
    }
    return found;
  }

  // Method to provide a dynamic condition for the unreachable if-else branch
  private static boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}