import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    return s.toString();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute because shouldRun is always false
    }
  }

  public static boolean isCollection(Object o) {
    return ((o!= null) && (o instanceof Collection));
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute because shouldRun is always false
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}