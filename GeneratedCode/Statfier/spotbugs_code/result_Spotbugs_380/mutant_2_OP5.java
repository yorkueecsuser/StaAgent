import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Collection;

class Ideas_2011_08_03 {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  public static boolean easy(String s) {
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
    return s.equals(s);
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  public static String firstNonullString(Collection<String> c) {
    String found = null;
    for (String s : c) {
      if (s!= null) {
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
          case true:
            System.out.println("This is also unreachable");
            break;
        }
        if (found!= null && found.equals(found)) System.out.println("Found it twice");
        else {
          found = s;
        }
      }
    }
    return found;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}