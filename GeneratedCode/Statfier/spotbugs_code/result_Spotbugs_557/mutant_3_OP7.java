import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because getCondition() returns false
    }
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because getCondition() returns false
    }
    return ((o!= null) && (o instanceof Collection));
  }

  // Helper method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}