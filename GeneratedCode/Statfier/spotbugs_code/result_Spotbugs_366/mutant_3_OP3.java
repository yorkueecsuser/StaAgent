import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3107916 {

  public static void main(String[] args) {
    String s1 = null;
    String s2 = "";
    doCompare(s1, s2);
  }

  @ExpectWarning("NP_NULL_ON_SOME_PATH_MIGHT_BE_INFEASIBLE")
  public static int doCompare(String s1, String s2) {
    int result;
    if (s1 == null && s2 == null) {
      result = 0;
    } else if (s1 == null && s2!= null) {
      result = -1;
    } else if (s1!= null && s2 == null) {
      result = 1;
    } else {
      // Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        result = -999; // This line is unreachable due to condition always being false
      }
      result = s1.compareTo(s2); // <- this strings is considered to be a
      // possible null pointer dereference of
      // s1.
    }
    return result;
  }

  @NoWarning("NP")
  public static int doCompare2(String s1, String s2) {
    int result;
    if (s1 == null && s2 == null) {
      result = 0;
    } else if (s1 == null) {
      assert s2!= null;
      result = -1;
    } else if (s2 == null) {
      assert s1!= null;
      result = 1;
    } else {
      // Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        result = -999; // This line is unreachable due to condition always being false
      }
      result = s1.compareTo(s2); // <- this strings is considered to be a
      // possible null pointer dereference of
      // s1.
    }
    return result;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}