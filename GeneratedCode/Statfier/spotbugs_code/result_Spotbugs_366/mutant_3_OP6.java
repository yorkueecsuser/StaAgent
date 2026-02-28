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
      result = s1.compareTo(s2); // <- this strings is considered to be a
      // possible null pointer dereference of
      // s1.
      
      // Unreachable for loop mutant
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will always be false
      }
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
      result = s1.compareTo(s2); // <- this strings is considered to be a
      // possible null pointer dereference of
      // s1.
      
      // Unreachable for loop mutant
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will always be false
      }
    }
    return result;
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}