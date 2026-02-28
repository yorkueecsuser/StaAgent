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
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
    return found;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return true/false based on some logic, but currently it returns false
  }
}